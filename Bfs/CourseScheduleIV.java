
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* here numsCourses courses you have to take, labeled from 0 to numCourses - 1
 * prerequisites[i][j] reprasend i has before the j 

 * numCourses = 4, prerequisites = [[1,2],[1,0],[2,0],[2,3]], queries = [[1,3],[1,0],[2,1],[2,3]]
 * prerequisites = 1 -> 2, 1 -> 0, 2 -> 0 here cycle was create 
 
 *  1------->2------->3
 *   \       /
 *    \     /
 *     >   <
 *      0
 * 
 * After than check queries array can we are true for all path
 * like 1 -> 3 are present in prerequisites path (here 1->2->3) are valid use of floyd   Warshall algoritham (beacuse 1 -> 3 is not direct connect but 1 -> 2 -> 3
 * are connect so it give return true)
 * 1 -> 0 are present in prerequisites path 
 * 2 -> 1 are not connect wiya path so return false
 * 
 * Said floyd warshall algoritham
 * use three loop s, d, v
 * s = source
 * d = destination
 * v = viya Node
 * 
 * if(s -> v) AND (v -> d) so definataliy true for (s -> d)
 * 
 * URL = https://leetcode.com/problems/course-schedule-iv/
 */



public class CourseScheduleIV {

    public static void main(String[] args){
        int numCourses = 4;
        int[][] prerequisites = {{1,2},{1,0},{2,0},{2,3}};
        int[][] queries = {{1,3},{1,0},{2,1},{2,3}};

        System.out.println(checkIfPrerequisite(numCourses, prerequisites, queries));
    }

    public static List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries){
               
        boolean[][] mat = new boolean[numCourses][numCourses];
        for(int i=0; i<prerequisites.length; i++){
            int XMat = prerequisites[i][0];
            int YMat = prerequisites[i][1];
            mat[XMat][YMat] = true;
        }

        //Floyd Warshall Algorithm( Sortest Path Algoritham)
        for(int k=0; k < numCourses; k++){
            for(int s=0; s<numCourses; s++){
                for(int d=0; d<numCourses; d++){
                    mat[s][d] = mat[s][d] || (mat[s][k] && mat[k][d]);
                }
            }
        }


        List<Boolean> list = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            int XDir = queries[i][0];
            int YDir = queries[i][1];
            list.add(mat[XDir][YDir]);
        }

        return list;
    }
}

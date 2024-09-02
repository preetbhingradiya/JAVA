/*
 * Explanation: The students go in turns as follows:
- Student number 0 uses 3 chalk so k = 22.
- Student number 1 uses 4 chalk so k = 18.
- Student number 2 uses 1 chalk so k = 17.
- Student number 3 uses 2 chalk so k = 15.
- Student number 0 uses 3 chalk so k = 12.
- Student number 1 uses 4 chalk so k = 8.
- Student number 2 uses 1 chalk so k = 7.
- Student number 3 uses 2 chalk so k = 5.
- Student number 0 uses 3 chalk so k = 2.
Student number 1 does not have enough chalk, so they will have to replace it.
 */


public class Student_chalk {
    public static void main(String[] args) {
        int[] chalk = {3,4,1,2};
        int k = 25;
        System.out.println(chalkReplacer(chalk, k));
    }

    public static int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int element : chalk){
            sum += element;
        }
    
        int reminder = (int) (k % sum);
    
        for(int index=0;index<chalk.length;index++){
            if(reminder < chalk[index]){
                return index;
            }
            reminder -= chalk[index];
        }
    
        return -1;
    }
    
}


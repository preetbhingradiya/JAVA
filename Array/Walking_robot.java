
import java.util.HashSet;
import java.util.Set;

public class Walking_robot {

    public static void main(String[] args) {
        int[] commands = {4,-1,4,-2,4};
        int[][] obstacles = {{2,4}};
        System.out.println(walkOfRobot(commands, obstacles));

    }

    public static int walkOfRobot(int[] commands, int[][] obstacles) {
        //direction is for like right, up, left, down
        //Right (0): Moving right increases the x-coordinate by 1 (dx = 1) and leaves the y-coordinate unchanged (dy = 0).
        // Up (1): Moving up increases the y-coordinate by 1 (dy = 1) and leaves the x-coordinate unchanged (dx = 0).
        // Left (2): Moving left decreases the x-coordinate by 1 (dx = -1) and leaves the y-coordinate unchanged (dy = 0).
        // Down (3): Moving down decreases the y-coordinate by 1 (dy = -1) and leaves the x-coordinate unchanged (dx = 0).

        int dires[] = {0, 1, 0, -1, 0};
        Set<Integer> set = new HashSet<>();

        for (int[] ele : obstacles) {
            set.add(f(ele[0], ele[1]));
        }

        int ans = 0, k = 0;
        int x = 0, y = 0;
        for (int command : commands) {
            if (command == -1) { // if -1 found robot turn right side
                k = (k + 1) % 4;
            } else if (command == -2) { // if -2 found robot turn left side
                k = (k + 3) % 4; //module 4 => 4 directions
            } else {
                while (command > 0) {
                    int nx = x + dires[k];
                    int ny = y + dires[k + 1];
                    if (set.contains(f(nx, ny))) { //if the corrent robot postiton is qeual to obstacl then break;
                        break;
                    }

                    x = nx;
                    y = ny;
                    ans = Math.max(ans, (x * x + y * y));
                    command--;
                }
            }
        }

        return ans;
    }

    public static int f(int x, int y) {
        return x * 16001 + y;
    }
}

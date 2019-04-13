import java.util.Scanner;


 public class Test {

    public static void main(String args[]) {
        /*Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            String enemy1 = in.next(); // name of enemy 1
            int dist1 = in.nextInt(); // distance to enemy 1
            String enemy2 = in.next(); // name of enemy 2
            int dist2 = in.nextInt(); // distance to enemy 2

            // Write an action using System.out.println()

            // Enter the code here
            
            if (dist1 < dist2) {
                System.out.println(enemy1);
            } else {
                System.out.println(enemy2);
            }

        }*/
    	
    	
    	Scanner in = new Scanner(System.in);

        // game loop
        while (true) {
            int max = 0;
            int imax = 0;
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                if (mountainH > max) {
                    max = mountainH;
                    imax = i;
                }
            }

            System.out.println(imax);
        }
    	
    	
    	
    	
    	
    }
}
package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        for (int i = 6; i > 0; i--) {
            int a;
            for (a = 0; a < i; a++) {
                System.out.print(" ");
            }
            for (int j = a; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
  }

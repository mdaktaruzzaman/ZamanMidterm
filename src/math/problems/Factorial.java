package math.problems;

/**
 * Created by mrahman on 04/02/18.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        int a = 5;
        long result = fact(a);
        System.out.println(result);
    }
    public static long fact(int a){
        if (a==0)
            return 1;
        else return a*fact(a-1);

    }
}

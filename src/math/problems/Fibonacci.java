package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int max = 40;
        int num1 = 0;
        int num2 = 1;

        for (int i=1;i<=max;i++)
        {
            System.out.println(num1);
            int sum=num1+num2;
            num1=num2;
            num2=sum;
        }
    }
}

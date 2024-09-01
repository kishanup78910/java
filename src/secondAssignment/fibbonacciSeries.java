package secondAssignment;
import java.util.*;

public class fibbonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int a = 0;
        int b = 1;

        int nthFibonacci = 0;

        if (n == 1) {
            nthFibonacci = a;
        } else if (n == 2) {
            nthFibonacci = b;
        } else {
            for (int i = 3; i <= n; i++) {
                nthFibonacci = a + b;
                a = b;
                b = nthFibonacci;
            }
        }

        System.out.println("The " + n + "th Fibonacci number is: " + nthFibonacci);

    }
}

package secondAssignment;

import java.util.Scanner;

public class amstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int digit = 0;
        while(temp!=0){
            digit++;
            temp = temp/10;
        }
        temp = n;
        int sum=0;

        while(temp!=0){
            int c = temp%10;
            sum+=Math.pow(c,digit);
            temp/=10;
        }
        if (sum == n) {
            System.out.println( " is an Armstrong number.");
        } else {
            System.out.println(" is not an Armstrong number.");
        }

    }
}

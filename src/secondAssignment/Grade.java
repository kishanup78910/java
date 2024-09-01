package secondAssignment;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n>80){
            System.out.println("A");
        }else if(n<=80 && n>70){
            System.out.println("B");
        }else if(n<70){
            System.out.println("Fail");
        }
    }
}

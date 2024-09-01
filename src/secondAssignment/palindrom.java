package secondAssignment;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a=sc.nextInt();
         int temp=a;
        int c=0;

        while(temp!=0){
            int x=temp%10;
            c= c*10+x;
            temp=temp/10;

        }

        if(a==c){
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}

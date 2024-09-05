package september.String;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        System.out.println("Reversed : " + str1);
        if(str1.equals(reversed)){
            System.out.println("Equal String");
        }else{
            System.out.println("Not requal");
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i< str1.length();i++){
            stack.push(str1.charAt(i));
        }
        String ans = "";
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        System.out.println(ans);
    }
}

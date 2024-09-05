package september.String;

import java.util.Scanner;

public class Stringbufferandbuilkder {
    public static void main(String[] args) {
//        StringBuffer sb = new StringBuffer("Hello");
//        sb.append(" World");
//        System.out.println(sb);
//
//        StringBuilder sbl = new StringBuilder("Hello");
//        sbl.append(" World");
//        System.out.println(sbl);
//
//        System.out.println(sbl.reverse());

        Scanner sc=new Scanner(System.in);
        String str1 = sc.nextLine();
        String reversed = "";
        for (int i = str1.length() - 1; i >= 0; i--) {
            reversed += str1.charAt(i);
        }
        System.out.println("Reversed : " + reversed);




    }
}

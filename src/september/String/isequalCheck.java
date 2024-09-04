package september.String;

public class isequalCheck {
    public static void main(String[] args) {
        String s1 = "Kishan";
        String s2="Ayush";
        String s3 = "Ayush";


        // to check equality of string
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));


        // toc check start with
        System.out.println(s1.startsWith("Ki"));
        System.out.println(s2.endsWith("h"));



        // is greater than or less thann

        char ch = 'a';
        int d = ch;
        System.out.println(d);


        String s5 = "Shasank";
        char charcterAt = s5.charAt(3);
//        System.out.println(charcterAt);
//        String s6="sandeep kumar mc";
//        System.out.println(s6.indexOf(" "));
//        System.out.println(s6.indexOf("mc"));
//        System.out.println(s6.substring(4,9));
//        System.out.println(s6.substring(4));


        // replace string
        String string1 = "I am kishan upadhyay";
        String replaceString = string1.replace('a','I');

        System.out.println(replaceString);

        String sh = " Kishan upadhyay ";
        System.out.println(sh);

        System.out.println(sh.trim());
        System.out.println(sh.toLowerCase());
        System.out.println(sh.toUpperCase());

        System.out.println(20.5f+sh);
        int num = 20;  // Use `int` instead of `let` for declaring an integer in Java
        float price = 75.5f;
        int amount = 100;
        String s10 = String.valueOf(num);
        String s11 = String.valueOf(amount);

        System.out.println(s10+s11);

    }
}

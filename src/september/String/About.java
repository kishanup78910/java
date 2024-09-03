package september.String;

public class About {
    public static void main(String[] args) {
        System.out.println("String is class || sequence of character string and string buffer");
        System.out.println("String is immutable we can mpodify using string buffer");

        System.out.println("Method in string");
        String str = "Komal";
        String str1 = new String("kishan");

        System.out.println(str.length());
        System.out.println(str1.length());

        // concatenation

        String str2 = str+str1;
        System.out.println(str2);
    }
}

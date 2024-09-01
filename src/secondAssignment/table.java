package secondAssignment;
import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.println(n*i);
        }
    }
}

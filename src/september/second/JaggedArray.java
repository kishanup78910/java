package september.second;

import java.util.Scanner;

//A jagged array is an array of arrays such that member arrays can be of different sizes, i.e., we can create a 2-D array but with a variable number of columns in each row. These types of arrays are also known as Jagged arrays.

public class JaggedArray {
    public static void main(String[] args) {
        int arr[][] = new int[3][];
        // column chznge according the number of row
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        //different number of element in the row

        Scanner obj  = new Scanner(System.in);
        for(int r=0;r<arr.length;r++){
            System.out.println("Enter the element of row no "+(r+1));
            for(int c=0;c<arr[r].length;c++){
                arr[r][c]= obj.nextInt();
            }
            System.out.println();
        }

        System.out.println("Elelemt of zagged array");
        for (int i = 0; i <arr.length ; i++) {
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}


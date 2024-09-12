package oops;

import java.util.Scanner;

public class functionoverloadingpolumorphism {
    void sum(int x,int y){
        System.out.println("sum"+(x+y));
    }

    void sum(int x,int y,int z){
        System.out.println("sum"+(x+y+z));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        functionoverloadingpolumorphism obj =  new functionoverloadingpolumorphism();
         obj.sum(2,3);


    }
}

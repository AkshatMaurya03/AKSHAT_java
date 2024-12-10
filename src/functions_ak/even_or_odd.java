package functions_ak;

import java.util.Scanner;

public class even_or_odd {
    public static void main(String[] args) {
        //Define a program to find out whether a given number is even or odd.
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER YOUR NUMBER");
        int number =in.nextInt();
        evorod(number);

    }
     static void evorod(int a) {
        if (a%2==0)
            System.out.println("even");
        else
            System.out.println("odd");


    }
}

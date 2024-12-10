package functions_ak;

import java.util.Scanner;

public class sum_of_two {
    public static void main(String[] args) {
        //Write a program to print the sum of two numbers entered by user by defining your own method.
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        int num1= in.nextInt();
        int num2= in.nextInt();
        int result= sum2(num1, num2);
        System.out.println(result);

    }

    static int sum2(int a, int b) {
        int sum= a+b;
        return sum;
    }
}

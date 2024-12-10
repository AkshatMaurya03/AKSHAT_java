package functions_ak;

import java.util.Scanner;

public class factorial_of_number{
    public static void main(String[] args) {
        //Write a program to print the factorial of a number by defining a method named 'Factorial'.
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER NUMBER YOU HAVE TO FIND THE FACTORIAL OF");
        int number=in.nextInt();
        double result=factorial(number);
        System.out.println(result);
    }

    private static double factorial(int number) {
        double fac=1;
        for (int i=number ; i>=1; i--)
        {
            fac*=i;
        }
        return fac;
    }

}

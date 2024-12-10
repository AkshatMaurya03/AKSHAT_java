package functions_ak;

import java.util.Scanner;

public class sum_of_first_n {
    public static void main(String[] args) {
        //Write a function that returns the sum of first n natural numbers.
        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR ENDING RANGE");
        int  range = in.nextInt();
        int result = addnumbers(range);
        System.out.println(result);
    }

    static int addnumbers(int  n) {
        int sum=0;
        for (int i =1;i<=n ;i++)
        {
            sum=sum+i;
        }
        return sum;


    }

}

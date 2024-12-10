package functions_ak;

import java.util.Scanner;

public class prime_range {
    public static void main(String[] args) {
//        Write a function that returns all prime numbers between two given numbers.
        Scanner in= new Scanner(System.in);
        int range;
        System.out.println("ENTER YOUR STARTING RANGE");
       int  str=in.nextInt();
        System.out.println("ENTER YOUR ENDING RANGE");
        range= in.nextInt();
        all_Prime(str,range);
        
    }

    static void all_Prime(int str,int range) {
        for (int i=str ; i<= range ;i++)
        {
            if (prime(i)==1)
                System.out.print(i+",");
            
        }
    }
    
    static int prime(int n){
        int count=0;
        for (int i=1;i<=n ;i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            return 1;
        else 
            return 0;
    }
}

package JAVA_topics.Conditionals_ak;

import java.util.Scanner;

public class palindrome
{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int original=n;
        int  rev=0;
        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(original==rev)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}

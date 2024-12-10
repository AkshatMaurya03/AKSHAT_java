package functions_ak;


import java.util.Scanner;

public class  min_and_max{
    public static void main(String[] args) {
      //  Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
        Scanner in =new Scanner(System.in);
        System.out.println("ENTER 3 VALUES");
        int a=in.nextInt();
        int c=in.nextInt();
        int b=in.nextInt();
        System.out.println("ENTER 1 FOR MINIMUM AND 2 FOR MAXIMIUM OF THE THREE NUMBERS");
        int choice=in.nextInt();
        switch (choice)
        {
            case 1:
                int minimum=min(a,b,c);
                System.out.println(minimum);
                break;
            case 2:
                int maximum =max(a,b,c);
                System.out.println(maximum);
                break;
            default:
                System.out.println("WRONG INPUT");
        }


    }
    static int min(int a, int b,int c)
    {
        int min=a;
        if(b<a && b<c)
            min = b;
        else if(c<a && c<b)
            min =c;
        return min;

    }
    static int max(int a, int b,int c)
    {
        int max =a;
        if(b>a && b>c)
            max = b;
        else if(c>a && c>b)
            max =c;
        return max;

    }



}

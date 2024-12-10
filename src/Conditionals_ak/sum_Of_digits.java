package JAVA_topics.Conditionals_ak;

import java.util.Scanner;

public class sum_Of_digits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sod=0,input=in.nextInt();
        while(input>0)
        {
            int d=input%10;
            sod+=d;
            input=input/10;
        }
        System.out.println(sod);
    }
}

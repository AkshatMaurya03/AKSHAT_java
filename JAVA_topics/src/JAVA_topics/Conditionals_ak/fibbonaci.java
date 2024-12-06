package JAVA_topics.Conditionals_ak;

import java.util.Scanner;

public class fibbonaci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //0,1,1,2,3,5,8,13,
        System.out.println("ENTER NUMBER OF FIBBONACI TERMS YOU WANT: ");
        int n=in.nextInt();
        int a=0,b=1,c;
        System.out.print(a+",");
        System.out.print(b+",");
        for(int i=3;i<=n;i++) {
            c = a + b;
            if (i == n) {
                System.out.print(c);
            } else {
                System.out.print(c + ",");
                //a will become b and b will become c
                a = b;
                b = c;
            }
        }
    }
}

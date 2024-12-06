package JAVA_topics.functions_ak;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        int a=addTwoNumbers();
        System.out.println(a);
    }
    static int addTwoNumbers(){
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        return a+b;
    }
}

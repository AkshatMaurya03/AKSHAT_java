package functions_ak;

import java.util.Scanner;

public class if_eligible_for_vote {
    public static void main(String[] args) {
       // A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

        Scanner in=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age=in.nextInt();
        String result = youreligibility(age);
        System.out.println(result);
    }

     static String youreligibility(int age) {
        if (age < 18)
            return "you are not eligible to vote";
        else
            return "you are eligible to vote";


    }
}

package JAVA_topics.Conditionals_ak;

import java.util.Scanner;

public class area_of_a_circle {
        public static void main(String[] args) {

            Scanner in= new Scanner(System.in);
            double radius,pie=3.14;
            System.out.println("Enter radius of the circle");
            radius=in.nextInt();
            System.out.println("RADIUS of the circle : "+(pie*radius*radius));
        }
    }



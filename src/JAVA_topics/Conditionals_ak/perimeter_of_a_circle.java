package JAVA_topics.Conditionals_ak;

import java.util.Scanner;

public class perimeter_of_a_circle {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter the radius of the circle: ");
            double radius = in.nextDouble();
            double pi = 3.14;
            double perimeter = 2 * pi * radius;
            System.out.println("The perimeter (circumference) of the circle is: " + perimeter);
        }

}

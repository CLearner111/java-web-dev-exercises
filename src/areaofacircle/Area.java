package areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        double radius;
        Scanner input;

        do {
            radius=0;
            System.out.println("Input a radius: ");
            input = new Scanner(System.in);

            if (input.hasNextDouble()) {
                radius = input.nextDouble();
            } else {
                System.out.println("Input must be a number");
            }

            if(radius <= 0) {
                System.out.println("Input must be positive");
            }

        } while(radius <= 0);

        input.close();

        double areaOfCircle = Circle.getArea(radius);
        System.out.println("Area of circle: " + areaOfCircle);
    }
}

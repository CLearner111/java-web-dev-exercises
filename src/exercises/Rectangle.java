package exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Height?");
        int height = input.nextInt();
        System.out.println("Length?");
        int length = input.nextInt();
        System.out.println("Dimensions of your " + height +
                "x" + length + " rectangle: " + height*length);
    }
}

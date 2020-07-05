package exercises;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles driven?");
        double miles = input.nextDouble();
        System.out.println("Gallons of gas consumed?");
        double gas = input.nextDouble();
        double mpg = miles/gas;
        System.out.println("Your MPG: " + mpg);
        input.close();
    }
}

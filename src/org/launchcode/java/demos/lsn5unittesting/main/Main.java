package org.launchcode.java.demos.lsn5unittesting.main;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("Toyota", "Prius", 10, 50);
//        System.out.println(car.getMake() + " - " + car.getModel());
//        car.addGas(5);
//        System.out.println(car);
//        car.drive(410);
//        System.out.println(car);
//        car.drive(89);
//        System.out.println(car);
//        car.drive(1);
//        System.out.println(car);

        System.out.println(car);
        car.drive(50);
        System.out.println(car);
        car.addGas(.5);
        System.out.println(car);
        car.addGas(.5);
        System.out.println(car);
        car.addGas(.5);
        System.out.println(car);

    }
}

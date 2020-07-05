package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {

        HouseCat nermal = new HouseCat("Nermal",6);

        nermal.sleep();
        System.out.println(nermal.noise());
        nermal.eat();
        System.out.println("Satisfied: " + nermal.isSatisfied());
        System.out.println("Tired: " + nermal.isTired());
        System.out.println("Hungry: " + nermal.isHungry());

        System.out.println(nermal.noise());
    }
}

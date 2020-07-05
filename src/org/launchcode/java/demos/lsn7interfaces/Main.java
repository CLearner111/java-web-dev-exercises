package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Main {

    public static void printFlavorList(ArrayList<Flavor> flavorArrayList,String title) {
        System.out.println(title + ":\n");

        for (Flavor flavor : flavorArrayList) {


            System.out.println(flavor.getName() + ", " + flavor.getAllergens());
        }
    }

    public static void printConesList(ArrayList<Cone> coneArrayList,String title) {
        System.out.println(title + ":\n");

        for (Cone cone : coneArrayList) {


            System.out.println(cone.getName() + ": $" + cone.getCost());
        }
    }

    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

//        printFlavorList(flavors,"Before");
//        flavors.sort(new FlavorComparator());
//        printFlavorList(flavors,"After");


        System.out.println(flavors);

        printFlavorList(flavors,"Before");
        flavors.sort(new FlavorAlergenComparator());
        printFlavorList(flavors,"After");

//        printConesList(cones,"Before");
//        cones.sort(new ConeComparator());
//        printConesList(cones,"After");

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}

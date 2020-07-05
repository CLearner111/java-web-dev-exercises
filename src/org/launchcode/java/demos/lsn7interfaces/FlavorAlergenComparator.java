package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class FlavorAlergenComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor o1, Flavor o2) {

//        return (Integer)3.compareTo((Integer)5);
        return o1.countAllergens().compareTo(o2.countAllergens());
//        return o1.getName().compareTo(o2.getName());
    }
}

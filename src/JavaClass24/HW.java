package JavaClass24;

import java.util.ArrayList;

public class HW {
    public static void main(String[] args) {

        /*
        Create an ArrayList that will store 5 names into it.
         Find out whether the given ArrayList is empty or not?
         Check whether the specific name is present in an ArrayList or not?
         Find the size of your arrayList and print all values from that
         */

        ArrayList<String> names = new ArrayList<>(5);
        names.add("Taras");
        names.add("Myroslav");
        names.add("Vasil");
        names.add("Christina");
        names.add("Yuriy");

        System.out.println(names);
        System.out.println("Is ArrayList is empty? "+ names.isEmpty());
        System.out.println("Is name Taras present in the ArrayList? "+names.contains("Taras"));
        System.out.println("Size of this ArrayList is: "+names.size());




    }
}

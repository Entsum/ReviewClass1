package JavaClass25;

import java.util.ArrayList;

public class HW1 {
    public static void main(String[] args) {

        /*
        Create an arrayList of words. Remove every word that ends with “e”.
        */

        ArrayList<String> words = new ArrayList<>();
        words.add("Java");
        words.add("Sale");
        words.add("Vase");
        words.add("Country");
        words.add("Sport");

        var iterator = words.iterator();

        while (iterator.hasNext()){
            var letter =iterator.next();
            if (letter.endsWith("e")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}

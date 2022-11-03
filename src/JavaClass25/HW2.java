package JavaClass25;

import java.util.ArrayList;

public class HW2 {
    public static void main(String[] args) {

        /*
        Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
        */

        ArrayList<String> drinks=new ArrayList<>();
        drinks.add("Whiskey");
        drinks.add("Wine");
        drinks.add("Tequila");
        drinks.add("Juice");
        drinks.add("Vodka");
        drinks.add("Beer");
        drinks.add("Rum");

        var iterator = drinks.iterator();

        while (iterator.hasNext()){
            var drink = iterator.next();
            if (drink.contains("a")|| drink.contains("e")){
                System.out.println("water");
            }else{
                System.out.println(drink);
            }
        }
    }
}

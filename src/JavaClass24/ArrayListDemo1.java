package JavaClass24;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        //Syntax to create ArrayList
        ArrayList<String> colors=new ArrayList<>();
       //use add method to insert elements in an ArrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        //print all elements
        System.out.println(colors);
        //get method prints individual element from ArrayList
        System.out.println(colors.get(0));
        System.out.println(colors.get(2));
        System.out.println(colors.size());

        //getting all the elements through enhanced for loop
        for (String s : colors) {
            System.out.println(s);
        }
        System.out.println("*************************************************************************");


        for(String color:colors){
            System.out.println(color);
        }
    }
}

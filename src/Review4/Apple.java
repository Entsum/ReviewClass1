package Review4;

public class Apple extends Fruit {

    String size;
    String taste;
    double price;
    Apple(String name, String shape, String color, String size) {
        super(name, shape, color);
        this.size=size;
    }
    Apple(String name, String shape, String color, String taste, double price){
        super(name, shape, color);
        this.taste=taste;
        this.price=price;
    }


    public static void main(String[] args) {
        Apple app =new Apple("apple", "round", "red", "big");
        //app.color; not visible since it acc mod is Private

    }
}

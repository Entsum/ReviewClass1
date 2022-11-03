package Review4;

public class Fruit {

    private String color;
    protected String name;
    String shape;

    public static boolean fresh;

    public Fruit(String name){
        this.name=name;
    }
    protected Fruit(String name, String shape, String color){
        this(name);
        this.shape=shape;
        this.color=color;
    }

    protected static void havePeel() {
    }

    public void grow(){
        System.out.println("All fruits grow fresh"+fresh);

    }
    protected void haveBenefits(){
        System.out.println("All fruits good for your health");
    }

}

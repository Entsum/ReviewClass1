package JavaClass24;

public class horse {

    private String name;
   private String color;
    private int age;
    private double weight;
    private double height;

    public horse(String name, String color, int age, double weight, double height) {
        setName(name);
        setColor(color);
        setAge(age);
        setWeight(weight);
        setHeight(height);
    }



     void setName(String name) {
        this.name = name;
        if(name.length()>15){
            System.out.println("Name is too long");
        } else if (name.isEmpty()) {
            System.out.println("name cannot be empty");
        }else
            this.name=name;
     }
     public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("color can't be empty");
        }else{
            this.color = color;
        }

    }
    void setAge(int age) {
        this.age = age;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setHeight(double height) {
        this.height = height;
    }


    public String getName() {
        return name;
    }
    String getColor() {
        return color;
    }
    int getAge() {
        return age;
    }
    double getWeight() {
        return weight;
    }
    public double getHeight() {
        return height;
    }
    void printInfo(){
        System.out.println("Name: "+name+ ", Color: "+color+", Age: "+age+", Weight: "+weight+", Height: "+height);
    }
}
class Tester{
    public static void main(String[] args) {
        horse Mustang = new horse("Mustang","Black",7,650, 5.7);
        System.out.println(Mustang.getName());
        Mustang.printInfo();
    }
}


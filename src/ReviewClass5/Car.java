package ReviewClass5;

// with help of abstract class we can achieve 0-100% abstraction
public abstract class Car {
    String color, make, model;

    public Car(String make, String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    void drive(){
        System.out.println("All cars can drive");
    }

    abstract void start();

    abstract void stop();
}

abstract class Tesla extends Car{

        Tesla(String make, String model, String color) {

            super(make, model, color);
    }
    public void start(){

            System.out.println(make+"Starts automatically");
    }
    public void stop(){

            System.out.println(make+"Stops when you hit brake pedal");


        }
       public void charge(){
            System.out.println("You need to charge your car");
    }
}
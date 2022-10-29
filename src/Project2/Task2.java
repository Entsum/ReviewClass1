package Project2;

public class Task2 {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B.
    // Create class 'Marks' with an abstract method 'getPercentage' that will be returning
    //the average percentage of marks. Provide implementation of abstract method in classes
    //'A' and 'B'. The constructor of student A takes the marks in three subjects as its parameters and
    //the marks in four subjects as its parameters for student B. Test your code
    public static void main(String[] args) {
        A obj1 = new A(50, 60, 70);
        System.out.println(obj1.getPercentage());
        B obj2 = new B(70, 80, 85, 90);
        System.out.println(obj2.getPercentage());


    }
}

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    double a;
    double b;
    double c;

    A(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double getPercentage() {
        return (a + b + c) / 3;
    }
}

class B extends Marks {
    double a;
    double b;
    double c;
    double d;

    B(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    double getPercentage() {
        return (a + b + c + d) / 4;

    }
}

package Project2;

public class Task3 {
    //Create a Class Car that would have the following fields: carPrice and color and method calculateSalePrice()
    // which should be returning a price of the car.Create 2 subclasses: Sedan and Truck. The Truck
    //class has a field as weight and has its own implementation of calculateSalePrice() method in which returned price is calculated
    // as following: if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does its own implementation of calculateSalePrice(): if length of sedan is >20
    //feet then returned car price should include 5% discount, otherwise 10% discount
}

class Car {
    double carPrice;
    String color;

    double calculateSalePrice() {
        return carPrice;

    }
}

class Truck extends Car {
    double Weight;

    @Override
    double calculateSalePrice() {
        if (Weight > 2000) {
            return carPrice * 0.9;
        } else {
            return carPrice * 0.8;
        }
    }
}

class Sedan extends Car {
    double length;

    @Override
    double calculateSalePrice() {
        if (length > 20) {
            return carPrice * 0.95;
        } else {
            return carPrice * 0.9;
        }
    }
}

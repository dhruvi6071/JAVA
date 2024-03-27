// Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car that overrides the drive() method to print "Repairing a car".

package Inheritance;

class Vehicle {
    public void drive() {
        System.out.println("I can drive this vehicle");
    }
}

class Car extends Vehicle{
    public void drive(){
        System.out.println("Repairing this car");
    }
}

public class second {
    public static void main(String[] args){
        Vehicle vehicle = new Vehicle();
        Car car = new Car();

        vehicle.drive();
        car.drive();
    }
}

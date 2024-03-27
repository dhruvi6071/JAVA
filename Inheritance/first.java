// Write a Java program to create a class called Animal with a method called makeSound(). Create a subclass called Cat that overrides the makeSound() method to bark.

package Inheritance;
 class Animal{
    public void makeSound() {
    System.out.println("This animal makes sound");
   }
}

class Cat extends Animal{
    public void makeSound() {
        System.out.println("Cat do Meow");
    }
}

public class first {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        animal.makeSound();
        cat.makeSound();
    }
}

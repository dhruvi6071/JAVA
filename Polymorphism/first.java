// Write a Java program to create a base class Animal (Animal Family) with a method called Sound(). Create two subclasses Bird and Cat. Override the Sound() method in each subclass to make a specific sound for each animal.

package Polymorphism;

class Animal {
    public void sound(){
        System.out.println("This animal makes sound");
    }
}

class Bird extends Animal {
    public void sound(){
        System.out.println("Birds are gonna chirp");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat is gonna Meow");
    }
}

public class first {
    public static void main(String[] args){
        Animal animal = new Animal();
        animal.sound();

        Bird bird = new Bird();
        bird.sound();

        Cat cat = new Cat();
        cat.sound();
    }
}

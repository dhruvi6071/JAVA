package Polymorphism;

class Shape {
    public void Edge(){
        System.out.println("Define a shape");
    }
}

class Square {
    public void Edge(int a){
        System.out.println("It has four edges" + a +"," + a +","+ a+"," + a);
    }
}

class Rectangle{
    public void Edge(int a, int b) {
        System.out.println("It has four edges" + a + "," + b + "," + a + "," + b);
    }
}

class Triangle{
    public void Edge(int a, int b, int c) {
        System.out.println("It has three edges" + a + "," + b + "," + c);
    }
}


public class second {
    public static void main(String[] args){
        Shape shape = new Shape();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();
        Triangle triangle = new Triangle();

        shape.Edge();
        square.Edge(2);
        rectangle.Edge(3, 4);
        triangle.Edge(2, 5, 7);
    }

}

package Hybrid;

class A{
    int a;
    A(int a){
        this.a = a;
        System.out.println("class a has been invokked");
    }
}

class B extends A{
    int b;
    B(int a, int b){
        super(a);
        this.b= b;
        System.out.println("class b is invoked");
    }
}

class C extends A{
    int c;
    C(int a, int c){
        super(a);
        this.c=c;
        System.out.println("class c is invoked");
    }
}
public class hybrid {
    public static void main(String[] args){
        B second = new B(3, 5);
        C third = new C(7, 8);

        System.out.println("Value of a in obj B"+ second.a);
        System.out.println("Value of b in obj B"+ second.b);

        System.out.println("vaue of a in obj C"+ third.a);
        System.out.println("value of c in obj C" + third.c);
    }
}

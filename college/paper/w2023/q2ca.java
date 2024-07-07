class Rectangle{
    int length;
    int width;

    Rectangle(){
       this.length = 0;
        this.width = 0;
    }

    public static int getArea(int length, int width ){
        return width * length;
    }

}

public class q2ca {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.length = 23;
        rec.width = 34;
        // System.out.println(rec.getArea(3, 5));
    }
}

// Write a program that reads a number in meters, converts it to feet, and displays the result.
import java.util.*;

public class meter_to_foot {
    public static void main(String[] args){
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a value in meter");
        double number = num.nextDouble();
        num.close();

        double foot = (number * 3.28);
        System.out.println(number + " meter is " + foot + " in foot .");

    }
}

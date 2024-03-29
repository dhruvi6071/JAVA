// 5.Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing it by the square of your height in meters. Write a program that prompts the user to enter weight in pounds and height in inches and displays the BMI.
import java.util.*;

public class bmi_calculate {
    public static void main(String[] args){
        Scanner wei = new Scanner(System.in);
        System.out.println("Enter weight in Pounds");
        float weigh = wei.nextFloat();
        

        Scanner hei = new Scanner(System.in);
        System.out.println("Enter height in inches");
        Float heigh = hei.nextFloat();
        hei.close();
        wei.close();

        double weight = weigh * 0.45359237;
        double height = heigh * 0.0254;

        double bmi = (weight)/(height * height);
        System.out.println("Your weight is " + weight + " and height " + height + " According to this data your BMI is : " + bmi);

    }
}

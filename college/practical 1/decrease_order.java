// 6.Write a program that prompts the user to enter three integers and display the integers in decreasing order.

import java.util.*;

public class decrease_order {

    public static void main(String[] args){
        Scanner one = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = one.nextInt();

        Scanner two = new Scanner(System.in);
        System.out.println("Enter second number");
        int second = two.nextInt();

        Scanner three = new Scanner(System.in);
        System.out.println("Enter third number");
        int third = three.nextInt();

        one.close();
        two.close();
        three.close();

        if(first >= second && first >= third ){
            if(second >=third) {
                System.out.println(""+first+ "" + second+"" +third);
            }
            else{
                System.out.println(first+ "" + third+ "" + second);
            }
        }

        else if(second >= first && second >= third){
            if(first >= third){
                System.out.println(second+"" + first+"" + third);
            }else{
                System.out.println(second +""+ third+"" +first);
            }
        }

        else if(third >= first && third >=second){
            if(first >= second) {
                System.out.println(third +""+ first +""+ second);
            }else{
                System.out.println(third +""+ second+"" +first);
            }
        }

    }
}

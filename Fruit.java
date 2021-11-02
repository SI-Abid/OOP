/**
 * 1. Recently “ABC” company has started a fruit business in your town. 
 * They want to make a software to calculate customer’s bill easily and efficiently. 
 * For example, they sell 3 types of fruits ( orange= 50tk, apple = 60tk, mango = 40tk per kg). 
 * To make the software, the “ABC” company has hired you. 
 * They will give you 2 lacs taka (Don’t take it seriously and stop dreaming. 
 * You are in the exam hall. Don’t be stupid :p ) for making the software successfully. 
 * Now you have to write a program which will take 3 integers as inputs 
 * ( which will define the amount of orange, apple and mangoes in kg customer took ) 
 * and print the total bill of that customer.
 */

import java.util.Scanner;

public class Fruit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int orange_price, apple_price, mango_price;
        orange_price=50;
        apple_price=60;
        mango_price=40;
        System.out.print("Enter the amount of orange(kg): ");
        int orange = in.nextInt();
        System.out.print("Enter the amount of apple(kg): ");
        int apple = in.nextInt();
        System.out.print("Enter the amount of mango(kg): ");
        int mango = in.nextInt();

        int bill = (orange*orange_price) + (apple*apple_price) + (mango*mango_price);
        System.out.println("Your total bill is: "+bill+" Tk.");
        in.close();
    }
}
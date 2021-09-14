package com.Ccranjan;
import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the total number of consumed units");

        int units = input.nextInt();
        double billpay = 0;
        if(units < 100)
        {
            billpay = units*1.2;
        }

        else if(units < 300)
        {
            billpay = 100 * 1.2 +(units-100)*2;
        }

        else if(units > 300)
        {
            billpay=100*1.20+200 *2+(units-300)*3;
        }
        System.out.println("The bill amount to be paid is:" +billpay);
    }
}

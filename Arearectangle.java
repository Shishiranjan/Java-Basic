package com.Ccranjan;
import java.util.Scanner;
public class Arearectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter length and breadth of a triangle");
        double length = input.nextInt();
        double breadth = input.nextInt();

        double area;
        area = length * breadth;

        System.out.println("The area of given rectangle is:" +area );

    }
}

package com.Ccranjan;
import java.util.Scanner;
public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle");
        double pi = 3.14;
        double radius = input.nextDouble();

        double perimeter;
        perimeter = 2 * pi * radius;

        System.out.println("The perimeter of given circle is:" +perimeter);
    }
}

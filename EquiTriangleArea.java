package com.Ccranjan;
import java.util.Scanner;
public class EquiTriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sides of a triangle");

        double side = input.nextDouble();

        double area;
        area =  0.43 * side * side;

        System.out.println("The area of given equilateral triangle is:" +area) ;
    }
}

package com.Ccranjan;
import java.util.Scanner;
public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and height of a cylinder");

        double pi = 3.14;

        double radius = input.nextDouble();
        double height = input.nextDouble();

        double volume;
        volume = pi * radius * radius * height;
        System.out.println("The volume of a given cylinder is:" +volume);
    }
}

package com.Ccranjan;
import java.util.Scanner;
public class VolumeCone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius and height of a cone respectively");

        double pi = 3.14;
        double radius = input.nextDouble();
        double height = input.nextDouble();
        double volume;
        volume = pi * radius * radius *(height / 3);

        System.out.println("the volume of a given cone is:" +volume);
    }
}

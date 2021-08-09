package com.Ccranjan;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit)
        {
            case "Mango":
                System.out.println("A king of fruit.");
                break;

            case "orange":
                System.out.println("A yellowish sweet fruit.");
                break;

            case "Watermelon":
                System.out.println("A large fruit having 80% water inside it.");
                break;

            case "grapes":
                System.out.println("A small fruit.");
                break;

            default:
                System.out.println("Please enter a valid fruit name.");
        }
    }
}

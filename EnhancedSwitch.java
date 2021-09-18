package com.ccranjan;
import java.util.Scanner;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("A king of fruit.");
            case "orange" -> System.out.println("A yellowish sweet fruit.");
            case "Watermelon" -> System.out.println("A large fruit having 80% water inside it.");
            case "grapes" -> System.out.println("A small fruit.");
            default -> System.out.println("Please enter a valid fruit name.");
        }
    }
}




package com.Ccranjan;
import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Here trim class actually remove the extra spaces of the string.
        char ch = input.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z')
        {
            System.out.println("lowercase");
        }

        else
        {
            System.out.println("Uppercase");
        }
    }
}

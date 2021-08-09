package com.Ccranjan;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = input.nextInt();

        int factorial = fact(n);
        System.out.println("The factorial of given number is:" +factorial);



    }

    static int fact(int num)
    {
        int output;
        if(num == 1)
        {
            return 1;
        }

        else
        {
            output = fact(num - 1) * num;
            return output;
        }
    }
}

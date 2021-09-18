package com.Ccranjan;
import java.util.Scanner;
public class AverageNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, count = 1;
        int incr, average, sum = 0;
        System.out.println("Enter the value of n");
         n = input.nextInt();

         while(count <= n)
         {
             incr = input.nextInt();
             sum = sum + incr;
             count++;
         }

         average = sum/n;
        System.out.println("The average of given numbers is:" +average);





    }
}

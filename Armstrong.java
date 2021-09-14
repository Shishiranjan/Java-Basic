package com.Ccranjan;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Arms = input.nextInt();
        System.out.println(isArmstrong(Arms));
    }



    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;

        while(n > 0)
        {
            int rem = n % 10;
            n = n / 10;
            sum = sum +(rem*rem*rem);
        }
        if(sum == original)
        {
            return true;
        }

        return false;
    }
}

package com.Ccranjan;
import java.util.Scanner;
public class prime_nums {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Prime(n));
    }

    static boolean Prime(int n)
    {
        if(n <= 1)
        {
            return false;
        }

        int c = 2;
        while(c*c <= n)
        {
            if(n % c == 0)
            {
                return false;
            }
            c++;
        }

        if(c * c >= n)
        {
            return true;
        }
        return false;
    }
}

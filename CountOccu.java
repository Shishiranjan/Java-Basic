package com.Ccranjan;

import java.util.Scanner;
public class CountOccu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 33134393;
        int count = 0;


        while(n > 0)
        {
            int rem = n % 10;
            if(rem == 3)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}

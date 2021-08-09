package com.Ccranjan;

import java.util.Scanner;
public class Type_casting {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //float num = input.nextFloat();
        //System.out.println(num);

        //int num = (int)(34.87);
        //System.out.println(num);

        //Automatic type promotions in expressions.

        int a = 765;
        byte b = (byte)(a);
        System.out.println(b);

    }
}

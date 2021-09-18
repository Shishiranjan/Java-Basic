package com.Ccranjan;
import java.util.ArrayList;
import java.util.Scanner;
public class listForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list  = new ArrayList<>(10);

        // Using the for loop to take the element of an arraylist from the user.
        for(int i = 0; i < 10; i++)
        {
            list.add(input.nextInt());
        }
        // To get an item of array at any index.

        for(int i = 0; i < 10; i++)
        {
            System.out.println(list.get(i));
        }
    }
}

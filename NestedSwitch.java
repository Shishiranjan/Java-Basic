package com.Ccranjan;

import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int EmpId = input.nextInt();
        String Department = input.next();

        switch (EmpId) {
            case 1 -> System.out.println("Shishiranjan");
            case 2 -> System.out.println("Randhir shah");
            case 3 -> System.out.println("Suraj prasad shah");


            default -> System.out.println("Enter the correct department name");

            }

        }
    }



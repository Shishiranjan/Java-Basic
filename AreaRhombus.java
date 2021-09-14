package com.Ccranjan;
import java.util.Scanner;
public class AreaRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the major and minor diagonal of rhombus");

        int diagonalP = input.nextInt();
        int diagonalQ = input.nextInt();

        double area;
        area = 0.5 * diagonalP * diagonalQ;

        System.out.println("The area of given rhombus is:" +area);
    }
}

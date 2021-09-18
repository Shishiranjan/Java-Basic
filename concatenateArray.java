package com.Ccranjan;
import java.util.Scanner;
import java.util.Arrays;
public class concatenateArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4,5,6};

        int newArr1 = arr1.length;
        int newArr2 = arr2.length;

        int[] result = new int[newArr1 + newArr2];

        System.arraycopy(arr1, 0, result, 0, newArr1);
        System.arraycopy(arr2, 0, result, newArr1, newArr2);

        System.out.println(Arrays.toString(result));

    }
}

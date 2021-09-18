package com.Ccranjan;

import java.util.Arrays;
import java.util.Scanner;
public class SwapArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] arr = {23, 45, 67, 52, 92, 38};
        swap(arr, 1, 3);
        System.out.println(Arrays.toString(arr));

    }

    static void swap(int[] arr, int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

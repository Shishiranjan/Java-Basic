package com.Ccranjan;

import java.util.Arrays;

public class passinfFunctions {
    public static void main(String[] args) {
        int[] nums = {24, 43, 12, 33, 27};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr)
    {
        arr[3] = 72;
    }
}

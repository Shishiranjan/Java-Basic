package com.Ccranjan;

import java.util.Scanner;

public class ArrayPermutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[input.nextInt()];
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }
        System.out.println(ans);




    }


}

package com.Ccranjan;
public class MaxValueRange {
    public static void main(String[] args) {
        int[] arr = {1, 12, 23, 34, 45, 56, 67,78, 89,99};
        System.out.println(maxRange(arr, 1, 3));
    }

    static int maxRange(int[] arr, int start, int end)
    {
        int maxValue = arr[start];
        for(int  i = start; i< end; i++)
        {
            if(arr[i] > maxValue)
            {
                maxValue = arr[i];

            }


        }
        return maxValue;
    }
}

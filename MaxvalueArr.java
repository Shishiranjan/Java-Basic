package com.Ccranjan;
public class MaxvalueArr {
    public static void main(String[] args) {
        int[] arr = {1, 23, 34, 45, 56, 67, 78, 89};
        System.out.println(max(arr));
    }



    static int  max(int[] arr)
    {
        int maxValue = arr[0];
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > maxValue)
            {
                maxValue = arr[i];
            }

        }

        return maxValue;

    }
}

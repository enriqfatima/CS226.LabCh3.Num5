package com.company;

public class BubbleSort {

    private static void bubbleSortAction(int[] arr) {

        int exchange = 0;
        int pass = 1;

        for(int m = 0; m < arr.length; m++)
        {
            for(int n = 1; n < (arr.length) - m; n++)
            {
                if(arr[n-1] > arr[n])
                {
                    exchange = arr[n-1];
                    arr[n - 1] = arr[n];
                    arr[n] = exchange;
                }
            }
        }
    }
}

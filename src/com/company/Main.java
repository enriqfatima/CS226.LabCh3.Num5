package com.company;


import java.util.ArrayList;
import java.util.Arrays;

public class Main {



    public static void main(String[] args) {
	// Given a list of int, n, sort them using bubble sort. (429)(461)


        ArrayList<Integer> values = new ArrayList<Integer>();
        values.add(334);
        values.add(45);
        values.add(1);
        values.add(6);
        values.add(90);

        //array that will be sorted using bubble sort.
        int arr[] = {334,67,3,1,9,10,3,6,} ;

        //print og array
        System.out.println("Original array from Array List is: " + values);
        System.out.println("\nOriginal array: " + Arrays.toString(arr));

        bubbleSortAction(arr);

        System.out.println("\nNew sorted array using bubble sort: " + Arrays.toString(arr));

        }

    private static void bubbleSortAction(int [] arr) {

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
/*

    on an array, values (in our case integers) are compared. from right to left,
    the smaller value will be on the right and greater on the left first i and i+1
    array will be compared. if [i] is greater than [i+1] on the array, then leave it.
    If not, then they will swap places.



    public static <T extends Comparable<T>> void sort(T[] table)
    {
        int pass = 1;
        boolean exchanges = false;
        do {
            exchanges = false;

            //compare each pair of elements
            for(int i = 0; i < table.length - pass; i++)
            {
                if(table[i].compareTo(table[i + 1]) > 0)
                {
                    T temp = table[i];
                    table[i] = table [i +1];
                    table[i +1] = temp;
                    exchanges = true;
                }
            }
            pass++;
        }while(exchanges);
        //Array is sorted.
    }
}



 */
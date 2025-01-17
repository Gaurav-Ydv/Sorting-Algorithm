package Sorting_Algorithm;

import java.util.Scanner;

public class BubbleSort {

    static void bubbleSort(int[] arr){
        int n = arr.length;

        /* n-1 iteration / passes */
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;  // has any swapping happened
            for (int j = 0; j < n-i-1; j++) {
                /*last i element are already at correct sorted positions,
                so no need to check them
                */
                if(arr[j] > arr[j+1]){
                    //swap - a[i], a[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false){    //has any swaps happened
                return;
            }
        }
    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+" array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original Array is : ");
        printArray(arr);
        System.out.print("Sorted array after using Bubble sort Algorithm : ");
        bubbleSort(arr);
        printArray(arr);


    }
}

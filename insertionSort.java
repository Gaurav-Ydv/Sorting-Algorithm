package Sorting_Algorithm;

import java.util.Scanner;

public class insertionSort {

    static void InsertionSort(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                //swap arr[j], arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : ");
        printArray(arr);
        InsertionSort(arr);
        System.out.println("Sorted Array using insertion sort : ");
        printArray(arr);
    }
}

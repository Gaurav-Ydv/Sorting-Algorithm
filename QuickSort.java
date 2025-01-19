package Sorting_Algorithm;

import java.util.Scanner;

public class QuickSort {
    static void displayArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int partition(int[] arr,int st, int end){
        int pivot  = arr[st];
        int count = 0;

        for (int i = st + 1; i <= end ; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);
        int i = st, j = end;

        //lesser element -> left side of pivot_index , greater element-> right side of pivot_index
        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;
            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        quickSort(arr,st,pi-1);
        quickSort(arr,pi+1,end);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : ");
        displayArray(arr);

        System.out.println("Array After Sorting : ");
        quickSort(arr,0,arr.length-1);
        displayArray(arr);

    }
}

package Sorting_Algorithm;

import java.util.Scanner;

public class mergeSort {
    static void merge(int[] arr,int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        int i, j, k;
        for (i = 0; i < n1; i++) {
            left[i] = arr[l+i];
        }
        for (j = 0; j < n2; j++) {
            right[j] = arr[mid+1+j];
        }
        i = 0;
        j = 0;
        k = l;
        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else
                arr[k++] = right[j++];
        }
        while(i < n1)
            arr[k++] = left[i++];
        while(j < n2)
            arr[k++] = right[j++];
    }
    static void mergesort(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = (l+r)/2;
        mergesort(arr,l,mid);
        mergesort(arr,mid+1,r);
        merge(arr, l, mid, r);
    }
    static void displayArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array is : ");
        displayArray(arr);

        mergesort(arr,0,n-1);
        System.out.println("Array after Sorting : ");
        displayArray(arr);

    }
}

package Sorting_Algorithm;

import java.util.Scanner;

public class countSort {
    static int findMax(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void basicCountSort(int[] arr){
        //find the largest element of the array
        int max = findMax(arr);
        //make frequency Array
        int[] count = new int[max+1];
        for (int i = 0; i < arr.length; i++) {  //2 4 2 2
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    static void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void countsort(int[] arr){
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);  //Find the largest element of the array
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {  //Make frequency Array    TC -> n
            count[arr[i]]++;
        }

        //Make prefix sum of Array
        for (int i = 1; i < count.length; i++) {   // TC -> max
            count[i] += count[i-1];
        }

        //Find the index of each element in the original Array and put it in output array
        for (int i = n-1; i >= 0 ; i--) {  // TC -> n
            int idx = count[arr[i]] -1;
            output[idx] = arr[i];
            count[arr[i]]--;
        }
        //copy all elements of output to arr
        for (int i = 0; i < n; i++) {    // TC -> n
            arr[i] = output[i];
        }
    }



    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : ");
        printArray(arr);

        System.out.println("Sorted Array is : ");
        basicCountSort(arr);
        printArray(arr);

        System.out.println("After sorting Array is : ");
        countsort(arr);
        printArray(arr);

    }
}

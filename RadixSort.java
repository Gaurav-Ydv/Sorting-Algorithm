package Sorting_Algorithm;

import java.util.Scanner;

public class RadixSort {

    static int findMax(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    static void countSort(int[] arr,int place){
        int n = arr.length;
        int[] count = new int[10];
        for (int i = 0; i < n; i++) { //Make frequency Array , arr[i] = 105 frequency[5]++ , place = 1(ones)
            count[(arr[i]/place) % 10]++;
        }
        //Make prefix sum array of count array
        for (int i = 1; i < count.length; i++) {  //Find prefix_sum
            count[i] += count[i-1];
        }
        //FInd the index of each element of originalArray and put it into the output Array
        int[] output = new int[n];
        for (int i = n-1; i >= 0; i--) {
            int idx = count[(arr[i]/place) % 10] - 1;
            output[idx] = arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all the element output to the Array
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    static void radixSort(int[] arr){
        int max = findMax(arr);  //get Maximum element
        //apply counting sort to sort the element based on place value
        for (int place = 1; max/place > 0 ; place *= 10) {
            countSort(arr,place);
        }
    }
    static void DisplayArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the element of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Original Array : ");
        DisplayArray(arr);

        System.out.println("Array after sorting : ");
        radixSort(arr);
        DisplayArray(arr) ;

    }
}

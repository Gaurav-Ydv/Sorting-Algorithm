package Sorting_Algorithm;
import java.util.Scanner;
public class selectionSort {

    static void selectionSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {  // i represent the current index

            //Find the minimum element in unsorted part of array
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            //swap current element and minimum element -> current index i will have correct element
            // swap([mi_index] , a[i])
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter "+n+" array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : ");
        printArray(arr);

        selectionSort(arr);
        System.out.println("Sorted Array using selection algorithm : ");
        printArray(arr);

    }
}

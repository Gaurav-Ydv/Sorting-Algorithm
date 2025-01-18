package Sorting_Algorithm;

import java.util.Scanner;

public class BubbleSort_ques1 {
/* Question(1) : Given an integer Array arr, move aii 0's to the end of it while
      maintaining the relative order of the non-Zero elements

      Note that you must do this in-place without making a copy of the Array
      input : 0 5 0 3 42
      output : 5 3 42 0 0
*/
    static void moveAllZerosToTheEnd(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            boolean flag = false;
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j] == 0 && arr[j+1] != 0){
                    //swap arr[j] , arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    flag = true;
                }
            }
            if(flag == false ){
                return;
            }
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
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the Array element : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array is : ");
        printArray(arr);

        System.out.println("Element After sorted : ");
        moveAllZerosToTheEnd(arr);
        printArray(arr);
    }




//
////---------Normal method----------------------------
//    public static void main(String[] args) {
//        int[] arr = {0,1,10,5,0,4};
//        int n = arr.length;
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//                if(arr[j] == 0 && arr[j+1] != 0){
//                    //swap arr[j] , arr[j+1]
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//        for(int val : arr){
//            System.out.print(val+" ");
//        }
//    }




}

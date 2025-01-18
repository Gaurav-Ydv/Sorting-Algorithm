package Sorting_Algorithm;

import java.util.Scanner;

public class selectionSort_ques1 {

    static void sortFruits(String[] fruits){
        int n = fruits.length;
        for (int i = 0; i < n-1; i++) {
            int min_index = i;
            for (int j = i+1; j < n; j++) {
                if(fruits[j].compareTo(fruits[min_index]) < 0){
                    min_index = j;
                }
            }
            // Swap fruits[min_index], fruits[i]
            String temp = fruits[i];
            fruits[i] = fruits[min_index];
            fruits[min_index] = temp;
        }
    }
    static void printString(String[] fruits){
        for (int i = 0; i < fruits.length; i++) {
            System.out.print(fruits[i]+" ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size of String : ");
//        String userInput = sc.nextLine();
//        String[] fruits = new String[userInput];

        sortFruits(fruits);
        printString(fruits);
        
//        for(String val : fruits){
//            System.out.print(val +" ");
//        }
    }
}

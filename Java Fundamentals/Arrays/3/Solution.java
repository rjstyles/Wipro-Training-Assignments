import java.util.Scanner;

/**
 *  Write a program to initialize an integer array with values and check if a given number
 *  is present in the array or not. If the number is not found, it will print -1 else it will
 *  print the index value of the given  number in the array
 */

class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 7, 8, 9, 0 };
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int n = in.nextInt(), id = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                id = i;
                break;
            }
        }

        System.out.println("Element found at index: " + id);
    }
}
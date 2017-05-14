import java.util.Scanner;

/**
 *  Write a program to initialize an integer array and find the maximum and minimum value of an array
 */

class Solution {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array elements(10): ");
        for (int i = 0; i < 10; i++) {
            arr[i] = in.nextInt();
        }

        int max = 0, min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }

        System.out.println("Max: " + max + ", Min: " + min);
    }
}
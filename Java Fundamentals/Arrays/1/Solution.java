/**
 *  Write a program to initialize an integer array and print the sum and average of the array
 */

class Solution {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        double sum = 0, avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        avg = sum / arr.length;

        System.out.println("Sum: " + sum + ", Average: " + avg);
    }
}
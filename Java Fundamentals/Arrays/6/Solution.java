/**
 * Write a program to initialize an array and print them in a sorted fashion
 */

class Solution {
    public static void main(String[] args) {
        int arr[] = { 0, 9, 8, 7, 6, 5, 4, 3, 2, 1 };

        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // selection sort
    static void sort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
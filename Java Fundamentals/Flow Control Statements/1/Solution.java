import java.util.Scanner;

/**
 * Write a program to check if a given number is Positive, Negative, or Zero.
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(n > 0) System.out.println("Positive");
        else if(n < 0) System.out.println("Negative");
        else System.out.println("Zero");
    }
}
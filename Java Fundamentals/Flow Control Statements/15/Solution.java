import java.util.Scanner;

/**
 * Write a program to add all the values in a given number and print. Ex: 1234->10
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int tmp = n, sum = 0;

        while(n > 0) {
            sum += n%10;
            n /= 10;
        }

        System.out.println(tmp + "->" + sum);
    }
}
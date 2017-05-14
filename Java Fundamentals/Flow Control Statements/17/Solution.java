import java.util.Scanner;

/**
 *  Write a program to reverse a given number and print
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt(), rev = 0, tmp = n;

        while(tmp > 0) {
            rev = rev*10 + (tmp%10);
            tmp /= 10;
        }
        
        System.out.println(rev);
    }
}
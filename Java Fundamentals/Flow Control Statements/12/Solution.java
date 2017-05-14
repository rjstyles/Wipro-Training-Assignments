import java.util.Scanner;

/**
 * Write a program to check if a given number is prime or not
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = in.nextInt();

        if(isPrime(n))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }

    static boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;

        int l = (int)Math.sqrt(n);
        for(int i=2; i <= l; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
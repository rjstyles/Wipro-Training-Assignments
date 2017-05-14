import java.util.Scanner;

/**
 * Write a Java program to find if the given number is prime or not.
 */

class Solution {
    public static void main(String[] args) {
        int n = 0;
        if(args.length >= 1) {
            n = Integer.parseInt(args[0]);
        }
        else {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter an integer number ");
            n = in.nextInt();
        }

        switch(n) {
            case 0: case 1: System.out.println(n + " is neither prime nor composite");
                break;
            default: 
                if(isPrime(n))
                    System.out.println(n + " is a prime number");
                else
                    System.out.println(n + " is a not prime number");
        }   
    }

    static boolean isPrime(int n) {
        int l = (int)Math.sqrt(n);
        
        for(int i=2; i <= l; i++) {
            if(n%i == 0)
                return false;
        }
        return true;
    }
}
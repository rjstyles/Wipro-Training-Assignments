/**
 *  Write a Java program to find if the given number is palindrome or not
 */

class Solution {
    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            if(n == revInt(n))
                System.out.println(n  + " is a palindrome");
            else
                System.out.println(n  + " is not a palindrome");
        }
        else
            System.out.println("usage: java Solution number");
    }

    static int revInt(int n) {
        int rev = 0;
        while(n > 0) {
            rev = rev*10 + (n%10);
            n/= 10;
        }
        return rev;
    }
}
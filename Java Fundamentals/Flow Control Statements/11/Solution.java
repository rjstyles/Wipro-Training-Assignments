/**
 *  Write a program to print even numbers between 23 and 57,
 *  each number should be printed in a separate row.
 */

class Solution {
    public static void main(String[] args) {
        for (int i = 23; i <= 57; i++) {
            if ((i & 1) == 0)
                System.out.println(i);
        }
    }
}
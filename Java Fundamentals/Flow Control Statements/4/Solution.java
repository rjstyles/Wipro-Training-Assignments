/**
 * Initialize two character variables in a program and display the characters in alphabetical order. 
 * Eg1) if first character is s and second is e
 * O/P: e,s
 * Eg2) if first character is a and second is e
 * O/P:a,e
 */

class Solution {
    public static void main(String[] args) {
        char first = 'a';
        char second = 'r';

        if(first < second)
            System.out.println(first + ", " + second);
        else
            System.out.println(second + ", " + first);
    }
}
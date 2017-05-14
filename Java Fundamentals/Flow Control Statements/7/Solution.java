import java.util.Scanner;

/**
 *  Write a program to convert from upper case to lower case and vice versa of an alphabet
 *  and print the old character and new character as shown in example (Ex: a->A, M->m).
 */

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().trim().charAt(0);
        System.out.println(ch + "->" + (char)(ch^32));
    }
}
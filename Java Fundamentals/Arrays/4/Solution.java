/**
 *  Initialize an integer array with ascii values and print the corresponding character
 *  values in a single row.
 */
class Solution {
    public static void main(String[] args) {
        int ascii[] = {73, 32, 76, 111, 118, 101, 32, 89, 111, 117};
        for (int i = 0; i < ascii.length; i++) {
            System.out.print((char)ascii[i] + " ");
        }
        System.out.println();
    }
}
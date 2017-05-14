import java.util.Scanner;

/**
 *  Write a program to print * in Floyds format (using for and while loop)
 *    *
 *    *  *
 *    *  *   *
 */
class Solution {
    public static void main(String[] args) {
        int n = 0;
        if(args.length == 0) {
            Scanner in = new Scanner(System.in);
            System.out.print("Please enter an integer number ");
            n = in.nextInt();
        }
        else {
            n = Integer.parseInt(args[0]);
        }

        for (int i = 0; i < n; i++) {
            int j = 0;
            while(j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
        }
    }
}
/**
 * Given a string, return a version without the first and last char, so "Wipro" yields "ipr". 
 * The string length will be at least 2.
 */
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(trimFirstLast(str));
    }

    static String trimFirstLast(String s) {
        return s.substring(1, s.length()-1);
    }
}
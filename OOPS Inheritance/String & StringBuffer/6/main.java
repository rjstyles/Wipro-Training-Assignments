/**
 * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside
 * and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0). 
 * If input is "hi" and "hello", then output will be "hihellohi".
 */
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(shortLongShort(str1, str2));
    }

    static String shortLongShort(String a, String b) {
        int l1 = a.length(), l2 = b.length();

        if(l1 < l2)
            return a + b + a;
        else
            return b + a + b;
    }
}
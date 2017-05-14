/**
 *  Given a string and an int n, return a string made of n repetitions of the last n characters of the string.
 *  You may assume that n is between 0 and the length of the string, inclusive.
 *  For example if the inputs are "Wipro" and 3, then the output should be "propropro".
 */
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int n = in.nextInt();
        System.out.println(nlastRepeat(str, n));
    }

    static String nlastRepeat(String s, int n) {
        String r = s.substring(s.length()-n);
        String big = "";
        for(int i=0;i<n; i++) {
            big += r;
        }
        return big;
    }
}
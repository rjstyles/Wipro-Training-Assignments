/**
 * main
 */
import java.util.Scanner;

public class main {

    public static void  main (String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = "", s2 = "";
        s1 = in.nextLine();
        s2 = in.nextLine();

        System.out.println(appendThemTogether(s1, s2));
    }

    static String appendThemTogether(String a, String b) {
        String s = "";
        if (a.charAt(a.length()-1) == b.charAt(0)) {
            s = a.substring(0, a.length()-2) + b;
        }
        else {
            s = a + b;
        }
        s.toLowerCase();
        return s;
    }
}
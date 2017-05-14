/**
 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
 * the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result. 
 * If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 */
import java.util.*;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.print(mergeStrings(a, b));
    }

    static String mergeStrings(String a, String b) {
        String bigger = "";
        int l1 = a.length(), l2 = b.length(), l = (l1 < l2)? l1 : l2, i;
        for(i = 0; i < l; i++) {
            bigger += a.charAt(i);
            bigger += b.charAt(i);
        }
        while(i <l1) {
            bigger += a.charAt(i);
            i++;
        }
        while(i <l2) {
            bigger += b.charAt(i);
            i++;
        }
        return bigger;
    }
}
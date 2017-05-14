/**
 *  Given a string, return a new string made of n copies of the first 2 chars of the original string 
 *  where n is the length of the string. The string may be any length. If there are fewer than 2 chars,
 *  use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".
 */

import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(nCopyString(str));
    }

    static String nCopyString(String s) {
        int n = s.length();
        String base = s.substring(0, 2);

        String str = "";

        for(int i=0; i<n; i++)
            str += base;
            
        return str;
    }
}
import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String word = in.next();
        System.out.println(charJustBeforeAndJustAfterString(str, word));
    }

    static StringBuffer charJustBeforeAndJustAfterString(String str, String word) {
        StringBuffer finalStr = new StringBuffer("");
        int l = str.length();
        for(int i=0; i<l; i++) {
            boolean flag = true;
            int l2 = word.length(), j, k;
            for(j=0, k =i; j<l2 && k <l; j++, k++) {
                if(word.charAt(j) != str.charAt(k)) {
                    flag = false;
                    break;
                }
            }
            if(j == l2 && flag) {
                if(i-1 >= 0)
                    finalStr.append(str.charAt(i-1));
                if(i+l2+1 < l)
                    finalStr.append(str.charAt(i+l2));
                i += (l2);
            }
        }
        return finalStr;
    }

    

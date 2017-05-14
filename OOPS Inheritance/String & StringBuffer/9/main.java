import java.util.Scanner;

class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuffer str = new StringBuffer(in.nextLine());
        int l = str.length();
        boolean valid[] = new boolean[l];

        for(int i=0; i<l; i++) valid[i] = true;

        for(int i=0; i<l; i++) {
            if(str.charAt(i) == '*') {
                valid[i] = false;
                if(i-1 >= 0)
                    valid[i-1] = false;
                if(i+1 < l)
                    valid[i+1] = false;
            }
        }

        StringBuffer newStr = new StringBuffer("");
        for(int i=0; i<l; i++) {
            if(valid[i]) {
                newStr.append(str.charAt(i));
            }
        }
        System.out.println(newStr);
    }
}
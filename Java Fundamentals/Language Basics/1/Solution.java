import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        if(args.length == 2) {
            System.out.println(args[0] + " Technologies " + args[1]);
        }
        else {
            System.out.println("Usage: java Solution string1 string2");
        }
    }
}
class Calculator {
    public static int powerInt(int num, int power) {
        int res = 1;
        for(int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
    public static double powerDouble(double num,int power) {
        double res = 1;
        for(int i = 0; i < power; i++) {
            res *= num;
        }
        return res;
    }
}

class Solution {
    public static void main(String[] args) {
        System.out.println("Value of 2^10 : " + Calculator.powerInt(2, 10));
        System.out.println("Value of 3.14^10 : " + Calculator.powerDouble(3.14, 10));
    }
}
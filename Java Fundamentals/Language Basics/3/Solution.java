class Solution {
    public static void main(String[] args) {
        if(args.length == 2) {
            int n1 = Integer.parseInt(args[0]), n2 = Integer.parseInt(args[1]);
            int sum = n1+n2;
            System.out.println("The sum of " + args[0] + " and "+ args[1] +  " is " + sum);
        }
        else
            System.out.println("Usage: java Solution number1 number2");
    }
}
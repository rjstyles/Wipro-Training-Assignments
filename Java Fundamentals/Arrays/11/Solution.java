/**
 * Write a program to find greatest number in a 3*3 array. 
 * The program is supposed to receive 9 integer numbers as command line arguments.
 */

class Solution {
    public static void main(String[] args) {
        if(args.length != 9)    
            System.out.println("Please enter 9 integer numbers");
        else {
            int arr[][] = new int[3][3];
            int max = 0;
            
            for(int i=0, k = 0; i<3; i++) {
                for(int j=0; j<3; j++, k++) {
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The given array is :");
            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    System.out.printf("%3d ", arr[i][j]);
                }
                System.out.println();
            }

            for(int i=0; i<3; i++) {
                for(int j=0; j<3; j++) {
                    if(max < arr[i][j])
                        max = arr[i][j];
                }
            }
            System.out.println("The biggest number in the given array is " + max);
        }
    }
}
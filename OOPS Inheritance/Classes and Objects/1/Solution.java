/**
 *  Create a class Box that uses a parameterized method to initialize the dimensions of a box.
 *  (dimensions are width, height, depth of double type). The class should have a method that 
 *  can return volume. Obtain an object and print the corresponding volume in main() function.
 */
class Box {
    double width, height, depth;
    Box(double w, double h, double d) {
        height = h;
        width = w;
        depth = d;
    }

    public double volume() {
        return width*height*depth;
    }
}
class Solution {
    public static void main(String[] args) {
        Box b = new Box(10, 20, 30);
        System.out.println("Volume of the box is: " + b.volume());
    }
}
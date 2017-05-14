import java.awt.SystemColor;

class Fruit {
    String name, taste;
    int size;

    Fruit() {
        name = "";
        taste = "";
        size = 0;
    }

    void eat() {
        System.out.println(name + " : " + taste);
    }
}

class Apple extends Fruit {
    Apple() {
        name = "Apple";
        size = 1;
    }
    void eat() {
        System.out.println(name + " : " + "Sweetie");
    }
}

class Orange extends Fruit {
    Orange() {
        name = "Orange";
        size = 2;
    }
    void eat() {
        System.out.println(name + " : " + "Sweet & Sour");
    }
}   

class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.eat();
        Orange orange = new Orange();
        orange.eat();
    }
}
class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char g) {
        this.name = name;
        this.email = email;
        gender = g;
    }
    String getName() {
        return name;
    }
    String getEmail() {
        return email;
    }
    char getGender() {
        return gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double p, int q) {
        this.name = name;
        this.author = author;
        price = p;
        qtyInStock = q;
    }

    String getName() {
        return name;
    }

    Author getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getQtyInStock() {
        return qtyInStock;
    }
    void setPrice(double p) {
        this.price = p;
    }

    void setQtyInStock(int q) {
        this.qtyInStock = q;
    }
}

class Solution {
    public static void main(String[] args) {
        Author author = new Author("Rajeev", "email@gmail.com", 'm');
        Book my_book = new Book("Art of Computer Programming", author, 99999, 1);
        
        System.out.println("Name of the book is: " + my_book.getName());
        System.out.println("Author of the book is: " + my_book.getAuthor().getName() + ", " +
                            "Email: " + my_book.getAuthor().getEmail() + ", "+
                            "Gender: " + my_book.getAuthor().getGender());
    }
}
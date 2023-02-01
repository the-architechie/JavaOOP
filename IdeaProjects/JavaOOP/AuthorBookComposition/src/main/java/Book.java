import java.util.Arrays;

public class Book {
    private final String name;

    public String getISBN() {
        return ISBN;
    }


    private String ISBN;
    private double price;
    private int qty;

    private final Author []authors;

    public Book(String ISBN, String name, Author[] authors, double price) {
        this.ISBN = ISBN;
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String ISBN, String name, Author[] authors, double price, int qty) {
        this.ISBN = ISBN;
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;

    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAuthor() {
        return authors;
    }


    @Override
    public String toString() {
        return "Book[" +
                "Name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", qty=" + qty +
                ", price=" + price +
                ']';
    }

    public String getAuthorsName() {
        String name = "";
        for (int i = 0; i < authors.length; i++){
            name = name + authors[i].getName();
            if (i < authors.length - 1) {
                name = name + ", ";
            }
        }
        return name;
    }

    public String getAuthorsEmail() {
        String email = "";
        for (int i = 0; i < authors.length; i++){
            email = email + authors[i].getEmail();
            if (i < authors.length - 1) {
                email = email + ", ";
            }
        }
        return email;
    }


    /**
    public String getAuthorName() {
        return new Author[]{getAuthor().getClass()};

    }
/**
    public char getAuthorGender() {
        return authors.getClass().getGender();
    }

    public String getAuthorEmail() {
        return Author.getAuthor();
    }

*/
}

package step4_OOP.topic3_Book.solution;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (" + year + ")";
    }
}

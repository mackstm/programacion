package ies.puerto;

/**
 * Book class
 * @author Jose Maximiliano Boada Martin
 */
public class Book {
    /**
     * Properties
     */
    private String title;
    private String author;
    private int yearPublished;

    /**
     * Default constructor
     */
    public Book() {}

    /**
     * Constructor with all parameters
     * @param title of book
     * @param author of book
     * @param yearPublished when book was published
     */
    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    /**
     * Getters and setters
     */
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Prints string with details of book object
     * @return string with details
     */
    public String printDetails() {
        return "Title: " + title + "\nAuthor: " + author + "\nYear published: " + yearPublished;
    }
}

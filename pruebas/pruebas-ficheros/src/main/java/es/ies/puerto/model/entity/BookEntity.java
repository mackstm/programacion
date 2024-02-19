package es.ies.puerto.model.entity;

/**
 * Book entity used for file manipulation examples
 * @author Jose Maximiliano Boada Martin
 */
public class BookEntity {
    /**
     * Properties
     */
    private String isbn;
    private String title;
    private String author;
    private String datePublished;
    private int libraryId;

    /**
     * Default constructor
     */
    public BookEntity() {}

    /**
     * Constructor with all relevant parameters
     * @param isbn of book
     * @param title of book
     * @param author of book
     * @param datePublished of book
     * @param libraryId where book can be found
     */
    public BookEntity(String isbn, String title, String author, String datePublished, int libraryId) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.datePublished = datePublished;
        this.libraryId = libraryId;
    }

    /**
     * Getters and setters
     */
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
}

import java.util.Objects;

// Create a class named Book with the following fields: title, author, and publicationYear.
public class Book {
    private final String title;
    private final String author;
    private final int publicationYear;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // This is the equals method that will be used to compare two Book objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Book book = (Book) obj;
        return publicationYear == book.publicationYear &&
                title.equals(book.title) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publicationYear);
    }
}

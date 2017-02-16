package oopPractice;

/**
 * Created by Angelina on 06.02.2017.
 */
public class Book {
    private String isbn;
    private String title;
    private String text;
    private Person author;
    private short pagesNumber;


    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public Person getAuthor() {
        return author;
    }

    public short getPagesNumber() {
        return pagesNumber;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }


    public void setPagesNumber(short pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (pagesNumber != book.pagesNumber) return false;
        if (!isbn.equals(book.isbn)) return false;
        if (!title.equals(book.title)) return false;
        if (!text.equals(book.text)) return false;
        return author.equals(book.author);

    }

    @Override
    public int hashCode() {
        int result = isbn.hashCode();
        result = 31 * result + title.hashCode();
        result = 31 * result + text.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + (int) pagesNumber;
        return result;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", author=" + author +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}

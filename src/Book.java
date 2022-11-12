import java.util.Objects;

public class Book {
    private String titleBook;
    private Author author;
    private int yearPublic;

    public Book(String titleBook, Author author, int yearPublic) {
        this.titleBook = titleBook;
        this.author = author;
        this.yearPublic = yearPublic;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearPublic() {
        return yearPublic;
    }

    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

    @Override
    public String toString() {
        return "Название книги: " + "\"" + titleBook + "\"" + ", Автор: " + author.toString() + ", Год публикации: " + yearPublic;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.titleBook, this.author, this.yearPublic);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return yearPublic == book.yearPublic && titleBook.equals(book.titleBook) && author.equals(book.author);
    }
}
//Class		CSE1322L
//Teacher	Peter Adeojo
//Student	Ronnin Collins
package _1322.Labs.Lab5;

class Book extends Item {
    private String author, ISBN;

    Book() { author = null; ISBN = null; }

    Book(String title, String author, String ISBN) {
        super(title);
        setAuthor(author);
        setISBN(ISBN);
    }

     void setAuthor(String author) {
        this.author = author;
    }

    void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    String getTitle() {
        return "";
    }
    String getAuthor() {
        return author;
    }

    String getISBN() {
        return ISBN;
    }

    @Override
    String getListing() {
        return "Book Name: " + getTitle() + "\nAuthor: " + getAuthor() + "\nISBN #: " + getISBN();
    }

    @Override
    public String toString() {
        return getTitle() + " " + getAuthor() + " " + getISBN();
    }
}

public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String ID, String author, String title, int numPages) {
        super(type, ID);
        setAuthor(author);
        setTitle(title);
        setNumPages(numPages);
    }

    @Override
    public double calculatePrice() {
        return 5;
    }

    // setters and getters
    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }
}
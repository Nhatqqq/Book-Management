public class Book extends Product{
    private String author;

    public Book(String id, String name, Float price, String author) {
        super(id, name, price);
        this.author = author;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

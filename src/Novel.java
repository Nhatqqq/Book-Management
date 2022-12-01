public class Novel extends Book {
    private String genre;

    public Novel(String id, String name, float price, String author, String genre) {
        super(id, name, price, author);
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

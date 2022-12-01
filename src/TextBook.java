public class TextBook extends Book{
    private String subject;

    public TextBook(String id, String name, Float price, String author, String subject) {
        super(id, name, price, author);
        this.subject = subject;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

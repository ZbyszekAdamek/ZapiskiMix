package ZadankaInternet;

public class Ebook extends Publication{
    public Ebook(String author, int year, double price) {
        super(author, year, price);
    }

    public Ebook(int year, String author) {
        super(year, author);
    }

    @Override
    public String toString() {
        return "Ebook{}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

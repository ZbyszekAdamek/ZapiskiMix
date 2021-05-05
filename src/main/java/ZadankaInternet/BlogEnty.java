package ZadankaInternet;

public class BlogEnty extends Publication{
    public BlogEnty(String author, int year, double price) {
        super(author, year, price);
    }

    public BlogEnty(int year, String author) {
        super(year, author);
    }

    @Override
    public String toString() {
        return "BlogEnty{}";
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

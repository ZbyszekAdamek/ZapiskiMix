package ZadankaInternet;

public class Magazine extends Publication{
    private static final String DEFAULT_AUTHOR = "Redaktor naczelny";

    public Magazine(String author, int year, double price) {
        super(author, year, price);
    }

    public Magazine(int year, String author) {
        super(year, author);
    }

    @Override
    public String toString() {
        return "Magazine{}";
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

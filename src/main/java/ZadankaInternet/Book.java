package ZadankaInternet;

public class Book extends Publication {
    private boolean isHardcover;


    public Book(String author, int year, double price) {
        super(author, year, price);
    }

    public Book(int year, String author) {
        super(year, author);
    }

    @Override
    public String toString() {
        return "Book{}";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public double getPrice() {
        if (isHardcover = true) {
            return price * 2;
        } else {
            return price;
        }
    }
}

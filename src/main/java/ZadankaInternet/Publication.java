package ZadankaInternet;

import java.util.Objects;

public class Publication {
    private String author;
    private int year;
    protected double price;

    public Publication(String author, int year, double price){
        this.author = author;
        this.year = year;
        this.price = price;
    }
    public Publication(int year, String author){
        this.year = year;
        this.author = "nieznany";
    }

    public String getAuthor() {
        return author;
    } //TODO - "jeżeli wartość zwrócona..."

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Publication{" +
                "author='" + author + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publication that = (Publication) o;
        return year == that.year && Double.compare(that.price, price) == 0 && Objects.equals(author, that.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, year, price);
    }
}

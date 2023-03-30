//Домашнее задание на закрепление:
//1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.

package HomeWorkSeminar1;

public class Product{
    protected String name;
    protected Double price;
    protected Double rating;

    public Product() {
    }

    public Product(String name, Double price, Double rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return  "\n[" +name + ", price = " + price +
                ", rating = " + rating +
                "]";
    }
}

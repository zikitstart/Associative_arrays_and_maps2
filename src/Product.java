import java.util.*;

public class Product {

    private String name;
    private double price;
    private int weight;

    public Product(String name, double price, int weight) {
        this.name = Utility.checkNull(name,"Default");
        this.price = Utility.checkDouble(price,0.0);
        this.weight = Utility.checkInt(weight,0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = Utility.checkNull(name,"Default");
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = Utility.checkDouble(price,0.0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = Utility.checkInt(weight,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Продукт:{" + name +
                " / Цена: " + price + " рублей" +
                " / Вес: " + weight + " киллограмм.}";
    }
}
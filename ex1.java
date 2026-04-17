import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public String toString() {
        return name + " " + price + " " + inStock;
    }
}

public class ex1 {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("Laptop", 800, true));
        list.add(new Product("Mouse", 25, true));
        list.add(new Product("Keyboard", 45, false));

        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        list.removeIf(p -> !isAffordable.test(p));

        System.out.println(list);
    }
}
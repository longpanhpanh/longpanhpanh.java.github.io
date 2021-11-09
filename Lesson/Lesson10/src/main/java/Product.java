import java.util.Collections;
import java.util.Comparator;

public class Product implements Comparable<Product> {
    private String name;
    private String model;
    private double price;
    private Category category;
    private int quantity;
    private int sold;

    public Product(String name, String model, double price, Category category, int quantity, int sold) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.category = category;
        this.quantity = quantity;
        this.sold = sold;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSold() {
        return sold;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + name + " - Mã: " + model + " - Giá bán: " + price + " - Danh mục: " + category.getValues()
                + " - Số lượng: " + quantity + " - Đã bán: " + sold;
    }

    @Override
    public int compareTo(Product o) {
        return o.getQuantity() - this.getQuantity();
    }


    }


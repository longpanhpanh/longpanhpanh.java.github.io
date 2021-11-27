package Collection;

public class Product {
    private int sold, quantity, id;
    private String name, desc, brand;
    private long price;
    Category category;

    public Product(int id, String name, String desc, long price, int quantity, int sold, String brand, Category category ) {
        this.sold = sold;
        this.quantity = quantity;
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.brand = brand;
        this.price = price;
        this.category = category;
    }

    public int getSold() {
        return sold;
    }

    public void setSold(int sold) {
        this.sold = sold;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + id + " - " +
                "Tên sản phẩm: " + name + " - " +
                "Giá: " + price + " - " +
                "Số lượng: " + quantity + " - " +
                "Đã bán: " + sold + "\n" +
                "Mô tả: " + desc + " - " +
                "Hãng: " + brand + " - " +
                "Danh mục: " + category.getValues();
    }
}

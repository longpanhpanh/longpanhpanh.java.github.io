package Collection;

public enum Category {
    PHONE("Điện thoại"),
    LAPTOP("Laptop"),
    APPLE("Apple"),
    ACCESSORY("Phụ kiện");

    private final String values;
    Category(String values) {
        this.values = values;
    }
    public String getValues() {
        return values;
    }

}

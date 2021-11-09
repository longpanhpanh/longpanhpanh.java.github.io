public enum Category {
    HOUSEWARE("Đồ gia dụng"),
    FASHION("Thời trang"),
    COSMESTIC("Mỹ phẩm"),
    FOOD("Thực phẩm");

    private final String values;
    Category(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}

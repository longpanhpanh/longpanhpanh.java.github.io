public enum Category {
    TVSHOW("TV Show"),
    MOVIE("Movie");


    private final String values;

    Category(String values) {
        this.values = values;
    }

    public String getValues() {
        return values;
    }
}

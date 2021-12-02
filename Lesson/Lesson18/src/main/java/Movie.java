public class Movie {
    int id;
    String title;
    String genre;
    String author;
    int view;
    Category category;

    public Movie(int id, String title, String genre, String author, int view, Category category) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.view = view;
        this.category = category;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    @Override
    public String toString() {
        return id + " - " + title + " - " + author + " - " + genre + " - " + " View: " + view + " - " + category.getValues();
    }
}

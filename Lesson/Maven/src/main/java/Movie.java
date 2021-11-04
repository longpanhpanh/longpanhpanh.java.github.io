import com.google.gson.annotations.SerializedName;

public class Movie {
    String name;
    String code;
    String genre;
    @SerializedName("length")
    double length;
    String producer;
    int year;

    public Movie(String name, String code, String genre, double length, String producer, int year) {
        this.name = name;
        this.code = code;
        this.genre = genre;
        this.length = length;
        this.producer = producer;
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " - " + code + " - " + genre + " - " + length + " - " + producer + " - " + year;
    }
}







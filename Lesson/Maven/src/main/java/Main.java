import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MovieRepository repo = new MovieRepository();
        ArrayList<Movie> list = repo.getData();
        repo.printList(list);
    }
}

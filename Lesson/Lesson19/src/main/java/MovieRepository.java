import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MovieRepository extends Thread {
    @Override
    public void run() {
        getListMovie();
        printList();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        findHighestView();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sortMovieByCategory();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sortMovieByGenre();
    }

    Scanner sc = new Scanner(System.in);
    ArrayList<Movie> listMovie;
    public ArrayList<Movie> getListMovie () {
        listMovie = new ArrayList<>();
        listMovie.add(new Movie(1, "Arcane", "Animated, Game, Fantasy", "Riot Entertainment", 60000000, Category.TVSHOW));
        listMovie.add(new Movie(2, "Red Notice", "Action, Comedy", "Netflix", 10000000, Category.MOVIE));
        listMovie.add(new Movie(3, "Games Of Thrones", "Fantasy, Drama, Tragedy", "HBO", 50000000, Category.TVSHOW));
        listMovie.add(new Movie(4, "Avengers", "Fantasy, Action", "Marvel", 90000000, Category.MOVIE));
        listMovie.add(new Movie(5, "Crush Landing On You", "K-Drama", "Netflix", 20000000, Category.TVSHOW));
        listMovie.add(new Movie(6, "Harry Potter", "Fantasy, Serial Novel", "HBO", 80000000, Category.MOVIE));
        listMovie.add(new Movie(7, "Sword Art Online", "Fantasy, Action, Romance", "LISA", 30000000, Category.TVSHOW));
        listMovie.add(new Movie(8, "Jurassic World", "Sci-fi, Action", "Amblin Entertainment", 35000000, Category.MOVIE));
        listMovie.add(new Movie(9, "Jujutsu Kaisen", "Animated, Action", "Ufotable", 45000000, Category.TVSHOW));
        listMovie.add(new Movie(10, "Expendables", "Action", "Millenium Film", 49000000, Category.MOVIE));


        return listMovie;
    }

    public void printList() {
        System.out.println("Thông tin của tất cả các bộ phim");
        listMovie.forEach(System.out::println);
        System.out.println("------------------------------------");
    }

    // Lấy ra 3 bộ phim có view cao nhất
    public void findHighestView () {
        System.out.println("3 bộ phim có view cao nhất");
        listMovie.sort((o1, o2) -> o2.getView() - o1.getView());
        listMovie.stream().limit(3).forEach(System.out::println);
        System.out.println("------------------------------------");

    }

    public void sortMovieByGenre () {
        System.out.println("Liệt kê phim theo thể loại");
        System.out.println("Nhập thể loại phim");
        String genre = sc.nextLine();
        List<Movie> listMovieByGenre =  listMovie.stream()
                .filter(movie -> movie.getGenre().toLowerCase().contains(genre.toLowerCase()))
                .toList();
        listMovieByGenre.forEach(System.out::println);
        System.out.println("------------------------------------");

    }


    public void sortMovieByCategory() {
        System.out.println("Liệt kê phim theo Category");
        System.out.println("Nhập category phim:");
        String category = sc.nextLine();
        List<Movie> listMovieByCategory = listMovie.stream()
                .filter(movie -> movie.getCategory().getValues().toLowerCase().contains(category.toLowerCase()))
                .toList();
        listMovieByCategory.forEach(System.out::println);
        System.out.println("------------------------------------");

    }

}



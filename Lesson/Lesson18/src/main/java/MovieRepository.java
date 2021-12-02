import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class MovieRepository {
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

    public void printList(ArrayList<?> list) {
        list.forEach(System.out::println);
    }

    // Lấy ra 3 bộ phim có view cao nhất
    public void findHighestView (ArrayList<Movie> list) {
       list.sort((o1, o2) -> o2.getView() - o1.getView());
       list.stream().limit(3).forEach(movie -> System.out.println(movie));
    }

    public void sortMovieByGenre (ArrayList<Movie> list) {
        System.out.println("Nhập thể loại phim");
        String genre = sc.nextLine();
        list.forEach(movie -> {
            if (movie.getGenre().toLowerCase().contains(genre.toLowerCase())){
                System.out.println(movie);
            }
        });
    }

    public void sortMovieByCategory(ArrayList<Movie> list) {
        boolean isCheck = false;
        while(!isCheck) {
            System.out.println("Chọn Category");
            System.out.println("1. TV Show");
            System.out.println("2. Movie");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                  List<Movie> listTvShow =  list
                          .stream()
                          .filter(movie -> movie.getCategory().equals(Category.TVSHOW))
                          .collect(Collectors.toList());
                  listTvShow.forEach(System.out::println);
                  isCheck = true;
                  break;
                case 2:
                    List<Movie> listMovie =  list
                            .stream()
                            .filter(movie -> movie.getCategory().equals(Category.MOVIE))
                            .collect(Collectors.toList());
                    listMovie.forEach(System.out::println);
                    isCheck = true;

                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

}



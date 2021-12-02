import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MovieRepository repo = new MovieRepository();
        ArrayList<Movie> list = repo.getListMovie();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("1. In thông tin các bộ phim");
            System.out.println("2. 3 Bộ phim có lượt xem cao nhất");
            System.out.println("3. Liệt kê phim theo category");
            System.out.println("4. Liệt kê phim theo thể loại");
            System.out.println("0. Thoát chương trình");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    repo.printList(list);
                    break;
                case 2:
                    repo.findHighestView(list);
                    break;
                case 3:
                    repo.sortMovieByCategory(list);
                    break;
                case 4:
                    repo.sortMovieByGenre(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }
}

package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
        ArrayList<Product> list = repo.getListProduct();
        while(true) {
            System.out.println("1. Liệt kê sản phẩm theo danh mục");
            System.out.println("2. Liệt kê số lượng sản phẩm theo hãng");
            System.out.println("3. Tìm và liệt kê sản phẩm, số lượng theo tên");
            System.out.println("0. Exit");
            System.out.println("Mời bạn chọn");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                repo.listSortByCategory(list);
                break;
                case 2:
                    repo.listSortByBrand(list);
                    break;
                case 3:
                    repo.listSortBySearch(list);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Không có lựa chọn này");
                    break;
            }

        }
    }
}

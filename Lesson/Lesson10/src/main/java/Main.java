import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductRepository pRepo = new ProductRepository();
        pRepo.products = pRepo.getData();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. In thông tin sản phẩm");
            System.out.println("2. In thông tin các sản phẩm có giá hơn 100k");
            System.out.println("3. Sắp xếp sản phẩm theo số lượng bán được");
            System.out.println("4. Lấy ra sản phẩm bán chạy nhất");
            System.out.println("5. In thông tin sản phẩm theo danh mục");
            System.out.println("0.Thoát chương trình");
            System.out.println("Nhập lựa chọn của bạn");
            int number = sc.nextInt();
            switch (number) {
                case 1:
                    System.out.println("Danh sách sản phẩm: ");
                    pRepo.print();
                    System.out.println("\n------------------\n");
                    break;
                case 2:
                    System.out.println("Sản phẩm có giá hơn 100k là");
                    pRepo.get100kProduct();
                    System.out.println("\n------------------\n");
                    break;
                case 3:
                    pRepo.compareProductByQuantity();
                    System.out.println("Sắp xếp theo số lượng đã bán");
                    pRepo.print();
                    System.out.println("\n------------------\n");
                    break;
                case 4:
                    System.out.println("Sản phẩm bán chạy nhất là:");
                    pRepo.getMaxSold();
                    System.out.println("\n------------------\n");
                    break;
                case 5:
                    System.out.println("Sản phẩm theo danh mục");
                    pRepo.compareProductByCategory();
                    pRepo.print();
                    System.out.println("\n------------------\n");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Giá trị lựa chọn không đúng vui lòng nhập lại");
                    break;

            }
        }
    }
}

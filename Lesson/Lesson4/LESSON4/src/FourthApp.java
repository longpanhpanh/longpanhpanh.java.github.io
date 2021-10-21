import java.util.Scanner;

public class FourthApp {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        
        menu();
        int choice = sc.nextInt();
        switch (choice) {
        case 1:
            System.out.println("Nhập cạnh a: ");
            int a = sc.nextInt();
            System.out.println("Nhập cạnh b: ");
            int b = sc.nextInt();
            System.out.println("Nhập cạnh c:");
            int c = sc.nextInt();
            Triangle.checkTriangle(a, b, c);
            break;
        case 2:
            System.out.println("Nhập điểm toán: ");
            double math = sc.nextDouble();
            System.out.println("Nhập điểm văn: ");
            double literature = sc.nextDouble();
            System.out.println("Nhập điểm lý: ");
            double physic = sc.nextDouble();
            System.out.println("Nhập điểm hóa: ");
            double chemistry = sc.nextDouble();
            AveragePoint.averageCalculate(math, literature, physic, chemistry);
            break;
        case 3:
            System.out.println("Cho phương trình dx2 + ex + f = 0 (d != 0), nhập d, e, f để nhận kết quả");
            System.out.println("Nhập hệ số bậc 2 d: ");
            double d = sc.nextDouble();
            System.out.println("Nhập hệ số bậc 1 e: ");
            double e = sc.nextDouble();
            System.out.println("Nhập hệ số tự do f: ");
            double f = sc.nextDouble();
            System.out.println("Kết quả của phương trình là");
            Equation.solution(d, e, f);
            break;
        case 4:
            System.exit(0);
        default:
            System.out.println("Không có lựa chọn này");
        }
        

    }    public static void menu() {
        System.out.println("Chọn đi bạn ơi");
        System.out.println("1 - Kiểm tra ba cạnh a b c của một tam giác và loại tam giác");
        System.out.println("2 - Tính điểm trung bình 4 môn toán, văn, lý, hóa");
        System.out.println("3 - Giải phương trình dx2 + ex + f = 0");
        System.out.println("4 - Thoát chương trình");
        System.out.println("Lựa chọn của bạn là: ");
    }

}



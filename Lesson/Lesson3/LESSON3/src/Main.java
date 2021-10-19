import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) throws Exception {

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Nhập tên: ");
        // String name = sc.nextLine();
        // System.out.println("Họ và tên: " + name);
        // System.out.println("Nhập tuổi: ");
        // int age = Integer.parseInt(sc.nextLine());
        // System.out.println("Tuổi: " + age);
        // System.out.println("Nhập địa chỉ: ");
        // String address = sc.nextLine();
        // System.out.println("Địa chỉ:" + address);

        Scanner sc = new Scanner(System.in);
        Hypotenuse.hypoCalculate(4, 3);
        Random generator = new Random();
        int randomNumber = generator.nextInt(100);
        String result = randomNumber % 2 == 0 ? randomNumber + " Đây là số chẵn" : randomNumber + " Đây là số lẻ";
        System.out.println("Số ngẫu nhiên là: " + result);
        System.out.println("Nhập số nguyên x: ");
        int x = sc.nextInt();
        System.out.println("Nhập số nguyên y: ");
        int y = sc.nextInt();
        XyInput.xyCalculate(x, y);
        sc.close();
    }
}

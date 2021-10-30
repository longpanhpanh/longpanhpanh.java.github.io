import java.util.Scanner;
public class Palyndrome {
    public static void isPalyndrome() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi bất kỳ ");
        String str = sc.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
                System.out.println("Đây là chuỗi Palyndrome");
                break;
            } else {
                System.out.println("Đây không phải chuỗi Palyndrome");
                break;
            }
        }
    }
}

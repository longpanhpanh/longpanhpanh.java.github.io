import java.util.Scanner;
public class Square {
    public static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều dài cạnh: ");
        int squareLength = sc.nextInt();
        System.out.println("Hình vuông có cạnh " + squareLength + " là: ");
        for (int i = 0; i < squareLength; i++) {
            for (int j = 0; j < squareLength; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        
    }
}

package ExceptionExcercise;

public class Triangle {
    public static void triangleCheck (int a, int b, int c) throws NumberFormatException, MyException {
        if (a < 0 || b < 0 || c < 0) throw new MyException("Các cạnh không được nhỏ hơn 0");
        if (a + b > c && b + c > a && c + a > b) {
            System.out.println("Đây là 3 cạnh của tam giác");
        } else {
            System.out.println("Đây không phải 3 cạnh của tam giác");
        }
    }
}

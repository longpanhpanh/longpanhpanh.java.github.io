public class Triangle {
    public static void checkTriangle(int a, int b, int c) {
        if (a < b + c && b < a + c && c < a + b) {
            if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông");
            } else if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Đây là tam giác cân");
            } else if (a * a > b * b + c * c || b * b > a * a + c * c || c * c > a * a + b * b) {
                System.out.println("Đây là tam giác tù");
            } else {
                System.out.println("Đây là tam giác nhọn");
            }
        }
        else {
              System.out.println("a, b, c không phải là 3 cạnh của tam giác");
          }
    }
}

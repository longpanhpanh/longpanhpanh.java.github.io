import java.util.Scanner;
public class Diagonal {
    public static void elements() {
    int n;  
    Scanner sc = new Scanner(System.in);
         
    System.out.println("Nhập vào bậc của ma trận: ");
    n = sc.nextInt();
         
    int A[][] = new int[n][n];
         
    System.out.println("Nhập các phần tử cho ma trận: ");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print("A[" + i + "]["+ j + "] = ");
            A[i][j] = sc.nextInt();
        }
    }
         
    System.out.println("Ma trận A vừa nhập:");
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(A[i][j] + "\t");
        }
        System.out.println("\n");
    }
         
    
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j) {
                System.out.print(A[i][j] + "\t");
            }

        }
    }
    
    }

}

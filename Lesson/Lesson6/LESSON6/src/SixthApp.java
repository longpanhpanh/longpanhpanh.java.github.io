import java.util.Scanner;
public class SixthApp {
    public static void main(String[] args) throws Exception {
        maxFind();
        transport();
        
    }
    // Bài 1
    public static void maxFind() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử của mảng: ");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Nhập phần tử ở vị trí: " + i);
            numbers[i] = sc.nextInt();
        }
        System.out.println("Mảng của bạn chứa các phần tử là: ");
        for (int number : numbers) {
            System.out.printf("%d \t", number);
        }

        int max = numbers[0];
        for (int number : numbers) {
            if (max < number) {
                max = number;
            }
        }
        System.out.println("Phần tử lớn nhất của mảng là: " + max);

    }
    // Bài 2
    public static void transport() {
        Scanner sc = new Scanner(System.in);
        Vehicle[] listVehicles = new Vehicle[2];
        for (int i = 0; i < listVehicles.length; i++) {
            System.out.printf("Nhập thông tin phương tiện %d \n", i + 1);
            System.out.println("Tên: ");
            String name = sc.nextLine();
            System.out.print("Model:");
            String model = sc.nextLine();
            System.out.println("Vận tốc tối đa: ");
            int speed = sc.nextInt();
            sc.nextLine();
            Vehicle vehicle = new Vehicle(name, model, speed);
            listVehicles[i] = vehicle;
        }

        for (Vehicle v : listVehicles) {
            System.out.println(v);
        }
    }

    
    
    
}

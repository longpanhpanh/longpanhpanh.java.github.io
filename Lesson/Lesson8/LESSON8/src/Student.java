import java.util.Scanner;
public class Student {
    int id;
    String name;
    double theoPoint;
    double pracPoint;


    public Student() {
        this.id = id;
        this.name = name;
        this.theoPoint = theoPoint;
        this.pracPoint = pracPoint;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập thông tin học sinh");
        System.out.println("Nhập id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập điểm lý thuyết: ");
        theoPoint = sc.nextDouble();
        System.out.println("Nhập điểm thực hành: ");
        pracPoint = sc.nextDouble();
    }

    public double averagePoint() {
        return (theoPoint + pracPoint) / 2;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", Điểm thực hành: " + pracPoint + ", Điểm lý thuyết: " + theoPoint;
    }

    
}



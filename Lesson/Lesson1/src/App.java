public class App {
    public static void main(String[] args) throws Exception {
        App.bmi();
        System.out.println("Chỉ số BMI của bạn là: " + App.bmi2());
        System.out.println("Chỉ số BMI của bạn là: " + App.bmi3(63.2, 1.7));
        // Gọi tới phương thức của class Bmi
        Bmi myBmi = new Bmi();
        myBmi.bmiCalculate(80.2, 1.8);
    }

    // Phương thức tính có kiểu trả về là void
     static void bmi() {
        double height = 1.9;
        double weight = 86.2;
        double result = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + result);
    }

    // Phương thức tính có kiểu trả về là double
    static double bmi2() {
        double height = 1.8;
        double weight = 70.5;
        double result = weight / (height * height);
        return result;

    }

    // Phương thức tính có kiểu trả về là double với 2 tham số truyền vào là weight và height
    static double bmi3(double weight, double height) {
        return weight / (height * height);
    }
}
// So sánh 3 kiểu:
// 1. phương thức có kiểu dữ liệu trả về là void: phải gán giá trị ngay trong phương thức, kiểu void không trả về kết quả
// 2. phương thức có kiêu dữ liệu trả vê là double (không truyền tham số):
// Gán giá trị trong phương thức, trả về kết quả đúng với kiểu dữ liệu đã khai báo
// 3. phương thức có kiểu dữ liệu trả về là double và có tham số truyền vào:
//truyền tham số vào hàm tính toán 
// khi gọi hàm thì nhập dữ liệu mình muốn và sẽ trả về kết quả có cùng kiểu dữ liệu đã khai báo trước

// Kết luận theo em dùng cách thứ 3 (trả về kiểu double và có truyền tham số) là tốt nhất vì có thể tùy ý thay đổi dữ liệu nhập vào, kết quả trả về là một kiểu dữ liệu nên


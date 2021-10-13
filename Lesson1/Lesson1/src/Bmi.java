public class Bmi {
    public void bmiCalculate(double weight, double height) {
        double result = weight / (height * height);
        System.out.println("Chỉ số BMI của bạn là: " + result);
    }
}

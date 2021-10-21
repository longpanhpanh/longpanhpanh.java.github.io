public class AveragePoint {
    public static void averageCalculate(double math, double literature, double physic, double chemistry) {
        double result = (math + literature + physic + chemistry) / 4;
        if (result < 4.5) {
            System.out.println("Hạng yếu");
        }
        else if (result >= 4.5 && result < 6.5) {
            System.out.println("Hạng trung bình");
        }
        else if (result >= 6.5 && result < 8) {
            System.out.println("Hạng khá");
        }
        else {
            System.out.println("Hạng giỏi");
        }
    }
}

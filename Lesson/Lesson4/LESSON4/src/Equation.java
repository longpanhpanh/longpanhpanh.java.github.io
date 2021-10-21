public class Equation {
    public static void solution(double d, double e, double f) {
        if (d == 0) {
            if (e == 0) {
                System.out.println("Phương trình vô nghiệm");
            }
            else {
                System.out.println("Phương trình có một nghiệm x = " + (-f/e));
            }
        } else {
            double delta = e * e - 4 * d * f;
            double x1;
            double x2;
            if (delta > 0) {
                x1 = (-e + Math.sqrt(delta)) / (2 * d);
                x2 = (-e - Math.sqrt(delta)) / (2 * d);
                System.out.println("Phương trình có 2 nghiệm là " + "x1 = " + x1 + " và x2 = " + x2);
            } else if (delta == 0) {
                x1 = (-e / (2 * d));
                System.out.println("Phương trình có nghiệm kép x1 = x2 = " + x1);
            }
            else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}

import java.util.Random;

public class RandomPrimeNumber {
    public static void isPrimeRandom() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println(number);
        if (isPrimeNumber(number)) {
            System.out.println("Đây là số nguyên tố");
        } else {
            System.out.println("Đây không phải số nguyên tố");
        }

    }
    
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        } 
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

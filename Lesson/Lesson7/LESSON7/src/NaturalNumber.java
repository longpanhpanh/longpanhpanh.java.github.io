public class NaturalNumber {
    public static void listNumber() {
        int number = 10;
        System.out.println(number + " số nguyên tố đầu tiên là: ");
        int count = 0;
        int i = 2;
        while (count < number) {
            if (isPrimeNumber(i)) {
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println("");
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int j = 3; j < 10; j+=2) {
            if (isPrimeNumber(j)) {
                System.out.print(" " + j);
            }

        }
    }
    
    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i < squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

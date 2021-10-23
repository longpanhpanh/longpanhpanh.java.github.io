import java.util.Scanner;

public class FifthApp {
    public static void main(String[] args) throws Exception {

        // static void randomNumber() {
        //     // Random ran = new Random();
        //     // int ranNumber = ran.nextInt(100);
        //     // Scanner sc = new Scanner(System.in);

        //     // int i = 0;
        //     // boolean isCheck = false;
        //     // while (!isCheck) {
        //     //     System.out.println("Nhập số bất kỳ: ");
        //     //     i = sc.nextInt();
        //     //     if (i == ranNumber) {
        //     //         System.out.println("Bạn đoán đúng rồi");
        //     //         isCheck = true;
        //     //     } else if (i < ranNumber) {
        //     //         System.out.println("Bạn đoán nhỏ hơn rồi");
        //     //     } else {
        //     //         System.out.println("Bạn đoán lớn hơn rồi");
        //     //     }

        // };

        // Bài 1
        String hello = "Hello every one";
        int count = 0;
        for (int i = 0; i < hello.length(); i++) {
            if (hello.charAt(i) == 'e') {
                count++;
                System.out.println("Tìm thấy ký tự e ở vị trí: " + i);
            }
        }
        System.out.println("Ký tự e xuất hiện " + count + " lần");

        // Bài 2 
        String strA = "abc def abc xyz";
        String strB = "abc";
        Find.find(strA, strB);

        // Bài 3
        LongestWord.maxFind();
        
        
    }
    
}






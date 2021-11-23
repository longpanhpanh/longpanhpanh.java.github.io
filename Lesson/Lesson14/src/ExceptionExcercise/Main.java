package ExceptionExcercise;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        System.out.println("1. Check Tam Giác");
        System.out.println("2. Check tuổi bầu cử");
        System.out.println("Chọn đi bạn");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                while(!isCheck) {
            try {
                    System.out.println("Nhập cạnh a: ");
                    int a = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập cạnh b: ");
                    int b = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập cạnh c: ");
                    int c = Integer.parseInt(sc.nextLine());
                    Triangle.triangleCheck(a, b, c);
                    isCheck = true;
                } catch (MyException e) {
                    System.out.println(e.getMessage());
                    System.out.println("Vui lòng nhập lại");
                } catch (NumberFormatException e) {
                    System.out.println("Các cạnh của tam giác phải là số nguyên");
                    System.out.println("Vui lòng nhập lại");
                }
            }
                break;
            case 2:
                while (!isCheck) {
                    try {
                        System.out.println("Nhập tên");
                        String name = sc.nextLine();
                        System.out.println("Nhập năm sinh");
                        int birth = Integer.parseInt(sc.nextLine());
                        System.out.println("Nhập địa chỉ");
                        String address = sc.nextLine();
                        ElectionAge.checkAge(name, birth, address);
                        isCheck = true;
                    } catch (MyException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Vui lòng nhập lại");
                    } catch (NumberFormatException e) {
                        System.out.println("Năm sinh phải là số");
                        System.out.println("vui lòng nhập lại");
                    }
                }

        }
    }
}

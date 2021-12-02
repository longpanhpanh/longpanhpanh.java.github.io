package Lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Account {
    String mobile = "0123456789";
    String password = "123456789";
    long balance = 5000000;
    Scanner sc = new Scanner(System.in);
    ArrayList<Transaction> transactions = new ArrayList<>();
    boolean isCheck = false;

    public void login() throws MyException {
        boolean ischeck = false;
        while(!ischeck) {
            System.out.println("Nhập số điện thoại");
            String user = sc.nextLine();
            System.out.println("Nhập mật khẩu");
            String pass = sc.nextLine();
            if (user.equals(mobile) && pass.equals(password)) {
                System.out.println("Đăng nhập thành công");
                menu();
                ischeck = true;

            } else {
                System.out.println("Đăng nhập thất bại vui lòng nhập lại");
            }
        }
    }

    public void menu() throws MyException {

        while (true) {
            System.out.println("1. Truy vấn số dư tài khoản");
            System.out.println("2. Chuyển tiền");
            System.out.println("3. Xem lịch sử giao dịch");
            System.out.println("0. Exit");
            int choice = sc.nextInt();
            sc.nextLine();
           switch (choice) {
               case 1:
                   viewBalance();
                   break;
               case 2:
                   transfer();
                   break;
               case 3:
                   printTransactions();
                   break;
               case 0:
                   System.exit(0);
                   break;
               default:
                   System.out.println("Không có lựa chọn này");
                   break;

           }

        }
    }

    public void viewBalance() {
        System.out.println("Số dư khả dụng: " + balance);
    }



    public void transfer () throws MyException {
        String account = "";
        while (!isCheck) {
            try {
                account = inputAccount();
                isCheck = true;

            } catch (MyException e) {
                System.out.println(e.getMessage());
            }
        }

        long money = inputMoney();
        sc.nextLine();

        System.out.println("Nhập nội dung chuyển khoản");
        String content = sc.nextLine();

        System.out.println("Số dư tài khoản: " + balance);

        transactions.add(new Transaction(LocalDate.now(), content, account, money));
    }

    public void printTransactions() {
        transactions.forEach(System.out::println);
    }

    public String inputAccount() throws MyException {
        System.out.println("Nhập tài khoản thụ hưởng");
        String account = sc.nextLine();
        String regex = "\\d{8,16}";
        if (!Pattern.matches(regex, account)) throw new MyException("Tài khoản thụ hưởng không hợp lệ");
        return account;
    }

    public long inputMoney() throws MyException {
        boolean isCheck = false;
        long moneyTransfer = 0;
        while(!isCheck) {
            System.out.println("Nhập số tiền cần chuyển");
            moneyTransfer = sc.nextLong();
           if (moneyTransfer >= 50000 && balance - moneyTransfer >= 50000) {
               balance = balance - moneyTransfer;
               isCheck = true;
           } else throw new MyException("Số tiền cần chuyển hoặc số dư sau chuyển phải lớn hơn 50.000");
       }
        return moneyTransfer;
    }


}

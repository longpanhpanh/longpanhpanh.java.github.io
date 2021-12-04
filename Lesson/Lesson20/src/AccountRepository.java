import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AccountRepository {
    Scanner sc = new Scanner(System.in);
    ArrayList<Account> listAccount;
    public ArrayList<Account> getAccount() {
        listAccount = new ArrayList<>();
        listAccount.add(new Account("tranthanhlong", "Tranthanhlong123_", "tranthanhlongita@gmail.com"));
        listAccount.add(new Account("panhpanh", "Panhpanh2208_", "panhbian@gmail.com"));
        listAccount.add(new Account("longpanhpanh", "Thanhlongita197_", "dia.jozu@gmail.com"));
        return listAccount;
    }


    public void print(ArrayList<Account> list) {
        list.forEach(System.out::println);
    }



    public String checkUsername () {
        String user = sc.nextLine();
        if (!listAccount.stream().anyMatch(a -> a.getUsername().equals(user))) {
            System.out.println("Kiểm tra lại username");
            login();
        }
        return user;
    }

    public String checkPassword () {
        String pass = sc.nextLine();
        if (!listAccount.stream().anyMatch(a -> a.getPassword().equals(pass))) {
            System.out.println("1. Đăng nhập lại");
            System.out.println("2. Quên mật khẩu");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    login();
                    break;
                case 2:
                    System.out.println("Nhập email để khôi phục mật khẩu");
                    String email = inputEmail();
                    if (listAccount.stream().anyMatch(a -> a.getEmail().equals(email))) {
                          for (Account a: listAccount) {
                            if (a.getEmail().equals(email)) {
                            System.out.println("Nhập mật khẩu mới");
                            String newPassword = sc.nextLine();
                            a.setEmail(newPassword);
                            System.out.println(a);
                        }
                    }
                          login();
                    } else {
                        System.out.println("Tài khoản chưa tồn tại");
                    }
            }
        }
        return pass;
    }

    public String inputPassword()  {
        String password = sc.nextLine();
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;])(?=\\\\S+$).{7,15}$";
        if (!Pattern.matches(regex, password)) {
            System.out.println("\"Password phải dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)\"");
        }

        return password;
    }

    public String inputEmail () {
        String email = sc.nextLine();
        String regex = "^(.+)@(\\\\S+)$";
        if (!Pattern.matches(regex, email)) {
            System.out.println("Email không hợp lệ");
        }
        return email;
    }


    public void menu()  {
        System.out.println("1. Đăng nhập");
        System.out.println("2. Đăng ký");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                login();
                break;
            case 2:
                register();
                break;

        }

    }


    public void login() {
        getAccount();
        System.out.println("Nhập username");
        String userName = checkUsername();
        System.out.println("Nhập mật khẩu");
        String passWord = checkPassword();
        System.out.println("Đăng nhập thành công");
        System.out.println("Bạn có thể thực hiên các công việc sau");
        System.out.println("1. Thay đổi username");
        System.out.println("2. Thay đổi email");
        System.out.println("3. Thay đổi mật khẩu");
        System.out.println("4. Đăng xuất ");
        System.out.println("0. Thoát chương trình");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                for (Account a: listAccount) {
                    if (a.getUsername().equals(userName)) {
                        System.out.println("Nhập username mới");
                        String newUserName = sc.nextLine();
                        a.setUsername(newUserName);
                        System.out.println(a);
                    }
                }

                break;
            case 2:
                for (Account a: listAccount) {
                    if (a.getUsername().equals(userName)) {
                        System.out.println("Nhập email mới");
                        String newEmail = sc.nextLine();
                        a.setEmail(newEmail);
                        System.out.println(a);
                    }
                }
                break;
            case 3:
                for (Account a: listAccount) {
                    if (a.getUsername().equals(userName)) {
                        System.out.println("Nhập mật khẩu mới");
                        String newPassword = sc.nextLine();
                        a.setEmail(newPassword);
                        System.out.println(a);
                    }
                }
            case 4:
                login();
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Không có lựa chọn này");

        }




    }

    public void register() {
        getAccount();
        System.out.println("Nhập username đăng ký");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = inputPassword();
        System.out.println("Nhập email");
        String email = inputEmail();
        if (listAccount.stream().anyMatch(a -> a.getUsername().equals(username))) {
            System.out.println("Email đã tồn tại");
        } else {
            listAccount.add(new Account(username, password, email));
        }
    }





}

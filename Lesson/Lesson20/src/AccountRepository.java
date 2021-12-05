import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountRepository {



    Scanner sc = new Scanner(System.in);
    ArrayList<Account> listAccount = getAccount();
    boolean isCheck = false;
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

    public void checkLogin ()  {
        System.out.println("Nhập username");
        String user = sc.nextLine();
        if (listAccount.stream().anyMatch(account -> account.getUsername().equals(user))) {
            Account acc = listAccount.stream()
                    .filter(account -> account.getUsername().equals(user))
                    .findAny()
                    .orElse(null);
            System.out.println("Nhâp mật khẩu");
            String pass = sc.nextLine();

            if (acc.getPassword().equals(pass)) {
                System.out.println("Chào mừng " + user);
                System.out.println("Đăng nhập thành công");
                service(acc);
            } else {
                System.out.println("1. Đăng nhập lại");
                System.out.println("2. Quên mật khẩu");
                int choice = sc.nextInt();
                sc.nextLine();
                switch (choice) {
                    case 1:
                        checkLogin();
                        break;
                    case 2:
                        System.out.println("Nhập email để khôi phục mật khẩu");
                        String email = sc.nextLine();
                        if (acc.getEmail().equals(email)) {
                            System.out.println("Nhập mật khẩu mới");
                            String newPassword = inputPassword();
                            if (newPassword == "") {
                                System.out.println("Đổi mật khẩu không thành công");
                            } else {
                                acc.setPassword(newPassword);
                                System.out.println("Mật khẩu mới đã được cập nhật");
                                menu();
                            }
                        } else {
                            System.out.println("Tài khoản chưa tồn tại");
                        }
                        break;
                    default:
                        System.out.println("Không có lựa chọn này");
                }
            }

        } else {
            System.out.println("Kiểm tra lại username");
        }


    }

    public void service(Account acc)  {

        while (true) {
            System.out.println("1 - Thay đổi username");
            System.out.println("2 - Thay đổi email");
            System.out.println("3 - Thay đổi mật khẩu");
            System.out.println("4 - Đăng xuất");
            System.out.println("0 - Thoát chương trình");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Nhập username mới");
                    String newUsername = sc.nextLine();
                    acc.setUsername(newUsername);
                    System.out.println("Đổi username thành công");
                    System.out.println(acc);

                    break;

                case 2:
                    System.out.println("Nhập email mới");
                    String newEmail = inputEmail();
                    if (newEmail == "") {
                        System.out.println("Đổi email không thành công");
                    } else {
                        acc.setEmail(newEmail);
                        System.out.println("Đổi email thành công");
                        System.out.println(acc);
                    }
                    break;
                case 3:
                    System.out.println("Nhập mật khẩu mới");
                    String newPassword = inputPassword();
                    if (newPassword == "") {
                        System.out.println("Đổi mật khẩu không thành công");
                    } else {
                        acc.setPassword(newPassword);
                        System.out.println("Đổi mật khẩu thành công");
                        System.out.println(acc);
                    }

                    break;
                case 4:
                    menu();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }


    public String inputPassword()  {
        String validatedPassword = "";
        String password = sc.nextLine();
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[.,-_;]).{7,15}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            validatedPassword = password;
        } else {
            System.out.println("Mật khẩu phải dài từ 7 đến 15 ký tự, chứa ít nhất 1 ký tự in hoa, 1 ký tự đặc biệt (. , - _ ;)");
        }
        return validatedPassword;
    }

    public String inputEmail ()  {
        String validatedEmail = "";
        String email = sc.nextLine();
        String regex = "^\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*(\\.\\w{2,3})+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if (matcher.matches()) {
            validatedEmail = email;
        } else {
            System.out.println("Email không hợp lệ");

        }

        return validatedEmail;
    }


    public void menu()  {
       while (true) {
           System.out.println("1. Đăng nhập");
           System.out.println("2. Đăng ký");
           int choice = sc.nextInt();
           sc.nextLine();
           switch (choice) {
               case 1:
                   checkLogin();
                   break;
               case 2:
                   register(listAccount);
                   break;
               default:
                   System.out.println("Không có lựa chọn này");
           }
       }

    }


    public void register(ArrayList<Account> listAccount)  {
        System.out.println("Nhập username đăng ký");
        String username = sc.nextLine();
        System.out.println("Nhập mật khẩu");
        String password = inputPassword();
        System.out.println("Nhập email");
        String email = inputEmail();
        if (listAccount.stream().anyMatch(a -> a.getEmail().equals(email))) {
            System.out.println("Email đã tồn tại");
        }

        if (password == "" || email == "") {
            System.out.println("Đăng ký không thành công do email hoặc mật khẩu không hợp lệ");
        }
        else {
            listAccount.add(new Account(username, password, email));
            print(listAccount);
        }

    }





}

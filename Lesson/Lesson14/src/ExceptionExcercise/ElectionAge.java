package ExceptionExcercise;


import java.time.LocalDate;

public class ElectionAge {

    static int year = LocalDate.now().getYear();
    String name;
    int birth;
    String address;
    public static void checkAge (String name, int birth, String address) throws MyException, NumberFormatException {
        if (birth < 1900 || birth > year ) throw new MyException("Năm sinh phải từ 1900 đến 2021");
        if (year - birth >= 18) {
            System.out.println("Bạn đã đủ tuổi bầu cử");
        } else {
            System.out.println("Bạn chưa đủ tuổi bầu cử");
        }


    }

}

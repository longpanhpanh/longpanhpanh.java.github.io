import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.text.DateFormatter;

public class Date {
    public static void getDate() {
        System.out.println("Hôm nay là ngày: " + LocalDate.now());
    }

    public static void dateFormatted() {
        DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Hôm nay là ngày: " + LocalDate.now().format(myFormat));
    }
}

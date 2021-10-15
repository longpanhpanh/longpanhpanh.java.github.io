import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        String s = "học lập trình java không khó";
        System.out.println("Độ dài của chuỗi s là: " + s.length());
        System.out.println("Chuỗi sau khi viết in các chữ k là: " + s.replace('k', 'K'));
        System.out.println("Chuỗi sau khi thay thế chữ khó thành dễ là: " + s.replaceAll("khó", "dễ"));
        System.out.println("Index của ký tự j là: " + s.indexOf('j'));
        Day day = Day.WEDNESDAY;
        System.out.println("Hôm nay là: " + day);
        // Bài tập thêm:
        // Cách 1:
        String str = "học lập trình khó quá";
        String str1 = str.replaceAll("học", "Học");
        String str2 = str1.replaceAll("quá", "quÁ");
        System.out.println("Chuỗi sau khi viết hoa ký tự đầu và cuối là: " + str2);
        // Cách 2:
        String firstLetter = str.substring(0, 1);
        String lastLetter = str.substring(str.length() - 1);
        String remainingLetter = str.substring(1, str.length() - 1);
        
        System.out.println(
            "Chuỗi sau khi viết hoa ký tự đầu và cuối là: "
            + firstLetter.toUpperCase() + remainingLetter + lastLetter.toUpperCase()
        );      
    }
}

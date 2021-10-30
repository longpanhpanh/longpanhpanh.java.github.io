import java.util.Scanner;
public class Standard {
    public static void standardlize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = sc.nextLine();
        name = name.trim();
        name = name.replaceAll("\s+", " ");
        System.out.println(name);
        String[] temp = name.split(" ");
        name = "";
        for (int i = 0; i < temp.length; i++) {
            name += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) {
                name += " ";
            }
            System.out.println(name);
        }
    }
}

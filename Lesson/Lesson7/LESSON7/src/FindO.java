public class FindO {
    public static void stringExcercise() {
        String str = "You only live once, but if you do it right, once is enough";
        int count;
        System.out.println("Index của các ký tự o là: ");
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf("o", i) == i) {
                System.out.println("Tìm thấy ký tự o ở vị trí: " + i);
            }
        }
        String[] temp = str.split(" ");
        System.out.println("Số từ trong chuỗi là: " + temp.length);
    }
}

public class LongestWord {
    public static void maxFind() {
        String input = "Không có gì quý hơn độc lập tự do";
        System.out.println(input);
        String[] inputs = input.split(" ");
        int lenMax = 0;
        int index = 0;
        for (int i = 0; i < inputs.length; i++) {
            int len = inputs[i].length();
            if (len > lenMax) {
                lenMax = len;
                index = i;
            }
        }
        System.out.println("Từ có độ dài lớn nhất là: " + inputs[index]);

   }
}

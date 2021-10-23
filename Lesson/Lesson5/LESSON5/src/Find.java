public class Find {
    public static void find(String strA, String strB) {
        if (strA.contains(strB)) {
            for (int i = 0; i < strA.length(); i++) {
                if (strA.indexOf(strB, i) == i) {
                    System.out.println("vị trí của chuỗi B trong chuỗi A là: " + i);        
                }

            }

        } else {
            System.out.println(-1);
        }
        

    }
}

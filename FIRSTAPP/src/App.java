public class App {

    int globalVariable; // Đây là biến toàn cục
    public static void main(String[] args) throws Exception {
        int localVariable; //Đây là biến cục bộ, biến này chỉ có thể sử dụng trong method main

        //Gọi tới method sum()
        App.sum(); //<tên class>.<tên phương thức>

        //Khi gọi phương thức không sử dụng static thì phải tạo đối tượng
        App myApp = new App(); // Tạo đối tượng myApp <Tên class> <tên biến tham chiếu> = new <tên class>();
        myApp.minus(); // Gọi tới phương thức <tên biến tham chiếu>.<tên phương thức>

        //Để nhận kết quar của phương thức có kiểu trả về là in ta có 2 cách
        //Cách 1: Tạo biến có cùng kiểu với kiểu trả về của phương thức để hứng kết quả
        int result = App.sumTwoNumber();
        System.out.println("kết quả: " +result);

        //Cách 2: sử dụng sysout để in kết quả luôn
        System.out.println(App.sumTwoNumber());

        //Với phương thức có tham số truyền vào
        double kq = App.div(10, 4); //Cần truyền vào tham số, ở đây a = 10, b = 4
        System.out.println("Kết quả : " + kq);

        //Khi muốn gọi tới biến hoặc phương thức của class khác
        Person ngoc = new Person(); //Đối tượng ngoc
        ngoc.name = "Ngọc"; //gán giá trị cho biến
        ngoc.age = 25;
        ngoc.address = "Hà Nội";
        ngoc.display(); //gọi phương thức


        Person hung = new Person(); //Đối tuong hung, có thể tạo nhiều đối tượng
        hung.name = "Hùng";
        hung.age = 26;
        hung.address = "Ninh Bình";
        hung.display();
    }

    public void myMethod(){
        globalVariable = 100; //Có thể gọi biêns toàn cục bất cứ đâu
        //localVariable = 100; //Đây là biến cục bộ nên không thể gọi trong phương thức khác

    }
    static void sum(){ //Sử dụng static thì không cần tạo đối tượng (phương thức tĩnh)
        int x = 10;
        int y = 20;
        int z = x + y;

        System.out.println("x + y = " + z);
    }

    void minus(){ //không sử dụng static 
        int x = 10;
        int y = 20;
        int z = y - x;

        System.out.println("y - x = " + z);
    }

    //Sử dụng với kiểu trả về khác
    static int sumTwoNumber(){
        int x = 10;
        int y = 20;
        return x+y;    //Kiểu trả về của phương thức là int nên cần 
        //return giá trị có cùng kiểu dữ liệu với kiểu  trả về với phương thức
    }

    //Phương thức có tham số truyền vào
    static double div(double a, double b){ //Truyền 2 tham số a và b có kiểu là double
        return a/b;

    }
}
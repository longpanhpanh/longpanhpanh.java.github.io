public class EighthApp {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.input();
        // System.out.println(student1.toString());
        Student student2 = new Student();
        student2.input();
        Student student3 = new Student();
        student3.input();
        // System.out.println("Điểm trung bình: " + student3.averagePoint());

        Student[] arr = new Student[3];
        arr[0] = student1;
        arr[1] = student2;
        arr[2] = student3;

        for (Student student : arr) {
            System.out.println(student);
        }

    }

    
}



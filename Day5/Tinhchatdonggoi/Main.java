package Day5.Tinhchatdonggoi;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Student
        Student student = new Student("Huy", 23);

        // Truy cập và thay đổi dữ liệu thông qua phương thức
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());

        student.setName("Mew");
        student.setAge(23);

        System.out.println("Updated student name: " + student.getName());
        System.out.println("Updated student age: " + student.getAge());
    }
}

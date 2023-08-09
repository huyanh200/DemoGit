package Day5.Tinhchatdonggoi;
public class Student {
    // Trường dữ liệu private
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Phương thức public để truy cập vào trường dữ liệu private
    public String getName() {
        return name;
    }

    // Phương thức public để thay đổi trường dữ liệu private
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuổi là giá trị dương");
        }
    }
}
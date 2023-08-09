package Day7.OOP2;



public class Main {
  public static void main(String[] args) {
        DaHinh[] animals = new DaHinh[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog();

        for (DaHinh animal : animals) {
            animal.makeSound();
        }
    }
}
//Lớp cha Animal có phương thức makeSound() để mô phỏng âm thanh của một con vật.
//Lớp con Dog và Cat kế thừa từ Animal và ghi đè phương thức makeSound() để triển khai cách mỗi con vật tạo ra âm thanh khác nhau.
//Trong phần Main, chúng ta tạo một mảng các đối tượng Animal, bao gồm cả Dog và Cat, và duyệt qua mảng để gọi phương thức makeSound() của từng đối tượng.
//Tính chất Đa hình cho phép chúng ta sử dụng cùng một phương thức (makeSound()) trên các đối tượng thuộc các lớp khác nhau (ở đây là Dog và Cat), và mỗi lớp có thể triển khai phương thức này một cách riêng biệt để tạo ra hành vi khác nhau.
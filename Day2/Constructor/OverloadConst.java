//chong nap contructor overload


package Day2.Constructor;

public class OverloadConst {
    
    int id;
    String name;
    int age;

    // Constructor có 2 tham số
    OverloadConst(int i,String n){
        id = i;
        name = n;
    }

    // Constructor có 3 tham số
    OverloadConst(int i, String n, int a){
        id = i;
        name = n;
        age = a;
    }

    // Phương thức
    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String args[]){
        // Tạo đối tượng và truyền vào 2 tham số
        OverloadConst s1 = new OverloadConst(121, "NIIT");

        // Tạo đối tượng và truyền vào 3 tham số
        OverloadConst s2 = new OverloadConst(232, "ICT Hà Nội", 20);

        // Gọi phương thức
        s1.display();
        s2.display();
    }
}

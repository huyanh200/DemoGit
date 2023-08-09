package Day2.Constructor;

public class Copy {
    
    int id;
    String name;

    // Constructor 2 tham số
    Copy(int i, String n){
        id = i;
        name = n;
    }

    // Constructor
    Copy(Copy s){
        id = s.id;
        name = s.name;
    }

    // Phương thức
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String args[]){

        // Tạo đối tượng
        Copy s1 = new Copy(121, "NIIT");
        Copy s2 = new Copy(s1);

        // Gọi phương thức
        s1.display();
        s2.display();
    }
}

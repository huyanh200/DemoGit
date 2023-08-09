//co tham so


package Day2.Constructor;

public class ParaConst {
    
// Thuộc tính
int id;
String name;

// Constructor có tham số
ParaConst(int i, String n) {
    id = i;
    name = n;
}

// Phương thức
void display(){
    System.out.println(id + " " + name);
}
public static void main(String args[]) {
    // Tạo đối tượng
    ParaConst s1 = new ParaConst(121, "NIIT");
    ParaConst s2 = new ParaConst(232, "ICT Hà Nội");

    // Gọi phương thức
    s1.display();
    s2.display();
}
}

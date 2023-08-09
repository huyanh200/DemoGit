
//Vấn đề khi không ghi đè phương thức toString()

package Day2.Tostring;

public class Studen {
    int rollno;
    String name;
    String city;
 
    Studen(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }
 
    public static void main(String args[]) {
        Studen s1 = new Studen(101, "Viet", "HaNoi");
        Studen s2 = new Studen(102, "Nam", "DaNang");
 
        // trình biên dịch sẽ ghi s1.toString() thay vì s1
        // có nghĩa là khi khai báo s1 thì phương thức s1.toString() 
        // được gọi
        System.out.println(s1);
        // trình biên dịch sẽ ghi s2.toString() thay vì s2
        System.out.println(s2);
    }
}

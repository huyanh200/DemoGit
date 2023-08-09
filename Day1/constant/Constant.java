package constant;
 
public class Constant {
    // Khai báo hằng số
    public static final int HOUR_OF_DAY = 24;
    public static final String CHUOI = "Hello Freetuts!";
     
    public static void main(String[] args) {
        System.out.println("Một ngày có " + HOUR_OF_DAY + " giờ");
        System.out.println(CHUOI);

        // Thay đổi giá trị biến CHUOI, lúc này trình biên dịch sẽ báo lỗi
       /*  CHUOI = "Welcome to Freetuts!";
        System.out.println(CHUOI);*/
    }
    
 
}
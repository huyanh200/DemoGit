/*Ép kiểu hẹp */

package datatype;

public class ExplicitAndImplicitCasting {
    public static void main(String[] args) {
        /*
         * Ép kiểu hẹp
         */
        double d = 100.01;  
        long l = (long) d;    // chuyển từ kiểu dữ liệu double về kiểu long 
        int i = (int) l;      // chuyển từ kiểu dữ liệu long về kiểu int
        System.out.println("Giá trị biến d = " + d);
        System.out.println("Giá trị biến l = " + l);
        System.out.println("Giá trị kiểu i = " + i);
    }
}

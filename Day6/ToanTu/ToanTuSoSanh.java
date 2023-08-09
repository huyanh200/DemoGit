

package Day6.ToanTu;

public class ToanTuSoSanh {public static void main(String[] args) {
        int p = 10, q = 20;
        boolean isEqual = (p == q);
        boolean isNotEqual = (p != q);
        boolean isLessThan = (p < q);
        boolean isGreaterThan = (p > q);
        boolean isLessThanOrEqual = (p <= q);
        boolean isGreaterThanOrEqual = (p >= q);

        System.out.println("isEqual: " + isEqual);// bằng nhau không.
        System.out.println("isNotEqual: " + isNotEqual);//khác nhau không.
        System.out.println("isLessThan: " + isLessThan);//bên trái có nhỏ hơn giá trị bên phải không.
        System.out.println("isGreaterThan: " + isGreaterThan);//bên trái có lớn hơn giá trị bên phải không.
        System.out.println("isLessThanOrEqual: " + isLessThanOrEqual);//bên trái có nhỏ hơn hoặc bằng giá trị bên phải không.
        System.out.println("isGreaterThanOrEqual: " + isGreaterThanOrEqual);// bên trái có lớn hơn hoặc bằng giá trị bên phải không.

     
        
    }}
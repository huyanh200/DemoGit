package Day6.ToanTu;

public class ToanTuBit{
    public static void main(String[] args) {
        int m = 5, n = 3;
        int andBit = m & n;
        int orBit = m | n;
        int xorBit = m ^ n;
        int complementBit = ~m;
        int leftShiftBit = m << 1;
        int rightShiftBit = m >> 1;

        System.out.println("AND bit: " + andBit);//Thực hiện phép AND bit trên hai giá trị và trả về một giá trị có các bit tương ứng là 1 nếu cả hai bit đều là 1, ngược lại trả về 0.
        System.out.println("OR bit: " + orBit);//Thực hiện phép OR bit trên hai giá trị và trả về một giá trị có các bit tương ứng là 1 nếu ít nhất một trong hai bit là 1.
        System.out.println("XOR bit: " + xorBit);//Thực hiện phép XOR bit trên hai giá trị và trả về một giá trị có các bit tương ứng là 1 nếu chỉ một trong hai bit là 1.
        System.out.println("Complement bit: " + complementBit);//Đảo ngược tất cả các bit của một giá trị, chuyển 0 thành 1 và ngược lại.
        System.out.println("Left shift bit: " + leftShiftBit);//
        System.out.println("Right shift bit: " + rightShiftBit);//
    }

}
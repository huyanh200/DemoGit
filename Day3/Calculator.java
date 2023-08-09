package Day3;

public class Calculator {
    // Phương thức tính tổng
    public int add(int a, int b) {
        return a + b;
    }

    // Phương thức tính hiệu
    public int subtract(int a, int b) {
        return a - b;
    }

    // Phương thức tính tích
    public int multiply(int a, int b) {
        return a * b;
    }

    // Phương thức tính thương
    public double divide(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            throw new ArithmeticException("Không thể chia cho số 0");
        }
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(10, 5);
        System.out.println("Tổng: " + result1);

        int result2 = calculator.subtract(20, 8);
        System.out.println("Hiệu: " + result2);

        int result3 = calculator.multiply(4, 3);
        System.out.println("Tích: " + result3);

        double result4 = calculator.divide(15, 3);
        System.out.println("Thương: " + result4);
    }
}

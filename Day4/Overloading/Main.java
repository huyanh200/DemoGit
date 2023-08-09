package Day4.Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sum1 = calculator.add(5, 3);             // Gọi phương thức add(int, int)
        double sum2 = calculator.add(2.5, 3.7);     // Gọi phương thức add(double, double)
        String combined = calculator.add("Hello, ", "world!"); // Gọi phương thức add(String, String)

        System.out.println("Sum 1: " + sum1);
        System.out.println("Sum 2: " + sum2);
        System.out.println("Combined: " + combined);
    }
}

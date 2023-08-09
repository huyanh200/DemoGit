
//object attribute nêu được những đặc điểm của  1 thực thể ảo nào đó như ví dụ về 1 chiếc ôto đoạn code đưới đây



package Day3.ObjectAttribute;

public class Car {
    // Instance variables (fields)
    private String color;
    private String brand;
    private int seatingCapacity;
    private String engineType;
    private int maxSpeed;
    private double price;

    // Constructor
    public Car(String color, String brand, int seatingCapacity, String engineType, int maxSpeed, double price) {
        this.color = color;
        this.brand = brand;
        this.seatingCapacity = seatingCapacity;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("Color: " + color);
        System.out.println("Brand: " + brand);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Engine Type: " + engineType);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Create an instance of Car
        Car myCar = new Car("Red", "Toyota", 5, "Gasoline", 180, 25000);

        // Display car information
        myCar.displayInfo();
    }
}

package Day7.OOP2;



public class DaHinh {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Lớp con Dog kế thừa từ lớp DaHinh và ghi đè phương thức makeSound()
class Dog extends DaHinh {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Lớp con Cat kế thừa từ lớp DaHinh và ghi đè phương thức makeSound()
class Cat extends DaHinh {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
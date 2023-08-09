package Day4.Overriding;

public class Animal {
    void makeSound() {
        System.out.println("con vật phát ra âm thanh");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("chó");
    }
}




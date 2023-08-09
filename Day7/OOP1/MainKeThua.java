package Day7.OOP1;



public class MainKeThua {
    public static void main(String[] args) {
        KeThua genericAnimal = new KeThua("Unknown");
        System.out.println("Generic animal species: " + genericAnimal.getSpecies());  // Output: Generic animal species: Unknown
        genericAnimal.makeSound();  // Output: The animal makes a sound.

        Dog myDog = new Dog("Canine", "Labrador");
        System.out.println("Dog species: " + myDog.getSpecies());    // Output: Dog species: Canine
        System.out.println("Dog breed: " + myDog.getBreed());        // Output: Dog breed: Labrador
        myDog.makeSound();  // Output: The dog barks.
    }
}
//Lớp KeThua là lớp cha có thuộc tính species và phương thức makeSound.
//Lớp Dog là lớp con kế thừa từ lớp Animal và thêm thuộc tính breed, cũng như ghi đè phương thức makeSound.
//Lớp con gọi constructor của lớp cha bằng từ khóa super(species) để khởi tạo thuộc tính của lớp cha.
//Tính chất Kế thừa cho phép lớp con kế thừa các thuộc tính và phương thức từ lớp cha, và có thể mở rộng và tùy chỉnh chúng theo nhu cầu. Trong ví dụ này, lớp Dog kế thừa thuộc tính species và phương thức makeSound từ lớp Animal, và có thể thêm thuộc tính và phương thức riêng của mình.
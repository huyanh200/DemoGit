package Day7.OOP1;



public class KeThua {
    private String species;

    public KeThua(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends KeThua {
    private String breed;

    public Dog(String species, String breed) {
        super(species);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

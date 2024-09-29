import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Shelter Management System");
        System.out.println("\nAdding animals to the shelter...");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(new Dog("Max"));
        animals.add(new Cat("Luna"));
        animals.add(new Dog("Bella"));
        animals.add(new Cat("Oliver"));

        System.out.println("\nListing all animals in the shelter:");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " the " + animal.getClass().getSimpleName());
        }

        // Call the makeSound method on each animal
        System.out.println("\nAnimal sounds:");
        for (Animal animal : animals) {
            animal.makeSound();
        }

    }
}
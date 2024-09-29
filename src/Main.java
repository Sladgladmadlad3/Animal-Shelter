import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Animal Shelter Management System");
        System.out.println("\nAdding animals to the shelter...");

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Max, a Dog");
        animals.add("Luna, a Cat");
        animals.add("Bella, a Dog");
        animals.add("Oliver, a Cat");

        for(int i = 0; i < animals.size(); i++) {
            System.out.println("Animal added: " + animals.get(i));
        }

        System.out.println("\nListing all animals in the shelter:");

    }
}

public class Animal {
    protected String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //method to be overwritten
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}

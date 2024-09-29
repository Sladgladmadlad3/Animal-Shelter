public class Dog extends Animal{

    //Constructor
    public Dog(String name) {
        super(name);
    }

    //Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

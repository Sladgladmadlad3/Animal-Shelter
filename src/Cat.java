public class Cat extends Animal{

    //Constructor
    public Cat(String name) {
        super(name);
    }

    //Override the makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }
}

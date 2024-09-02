// Class to test the sound() method of all animals
public class TestAnimal {
    public static void main(String[] args) {
        // Creating objects for each child class
        Animal lion = new Lion();
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Calling the overridden method using Animal references
        lion.sound(); // Output: Lion roars!
        cat.sound(); // Output: Cat meows!
        dog.sound(); // Output: Dog barks!
    }
}

public class TestAnimal {
    public static void main(String[] args) {
        // Creating instances of each subclass
        Animal lion = new Lion();
        Animal cat = new Cat();
        Animal dog = new Dog();

        // Using the reference of Animal to access sound() method
        lion.sound(); // Should print: Roar
        cat.sound(); // Should print: Meow
        dog.sound(); // Should print: Bark
    }
}

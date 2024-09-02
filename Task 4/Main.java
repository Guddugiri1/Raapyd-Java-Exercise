// Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Child object with default constructor:");
        Child child1 = new Child();

        System.out.println("\nCreating Child object with parameterized constructor:");
        Child child2 = new Child("Hello from Child!");
    }
}

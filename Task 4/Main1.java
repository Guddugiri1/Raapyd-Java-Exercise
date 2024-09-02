// Main.java
public class Main1 {
    public static void main(String[] args) {
        System.out.println("Creating Employee object with default constructor:");
        Employee emp1 = new Employee(); // Calls Employee's default constructor

        System.out.println("\nCreating Employee object with parameterized constructor:");
        Employee emp2 = new Employee("John", "Developer"); // Calls Employee's parameterized constructor
    }
}

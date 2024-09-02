// Employee.java
class Employee extends Person {
    // Default constructor
    public Employee() {
        super(); // Calls the default constructor of the parent class (Person)
        System.out.println("Inside Employee's Default Constructor");
    }

    // Parameterized constructor
    public Employee(String name, String role) {
        this(); // Calls the default constructor of the same class (Employee)
        System.out.println("Inside Employee's Parameterized Constructor: Role is " + role);
    }
}

// Person.java
class Person {
    // Default constructor
    public Person() {
        this("Unknown"); // Calls the parameterized constructor within the same class
        System.out.println("Inside Person's Default Constructor");
    }

    // Parameterized constructor
    public Person(String name) {
        System.out.println("Inside Person's Parameterized Constructor: Name is " + name);
    }
}

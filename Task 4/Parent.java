// Parent.java
class Parent {
    public Parent() {
        this("Default Parent Constructor");
        System.out.println("Inside Parent's Default Constructor");
    }

    public Parent(String message) {
        System.out.println("Inside Parent's Parameterized Constructor: " + message);
    }
}

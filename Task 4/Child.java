// Child.java
class Child extends Parent {
    public Child() {
        super();
        System.out.println("Inside Child's Default Constructor");
    }

    public Child(String message) {
        this();
        System.out.println("Inside Child's Parameterized Constructor: " + message);
    }
}

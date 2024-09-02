public class Students {
    private int rollno;
    private String name;
    private long mobile;

    // Default constructor
    public Students() {
        this.rollno = 0;
        this.name = "";
        this.mobile = 0;
    }

    // Constructor with rollno and name
    public Students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
        this.mobile = 0; // Default value for mobile
    }

    // Constructor with all data members
    public Students(int rollno, String name, long mobile) {
        this.rollno = rollno;
        this.name = name;
        this.mobile = mobile;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobile);
    }

    // Method to display only roll no and name
    public void display(boolean showMobile) {
        System.out.println("Roll No: " + rollno);
        System.out.println("Name: " + name);
        if (showMobile) {
            System.out.println("Mobile: " + mobile);
        }
    }

    public static void main(String[] args) {
        // Creating objects using different constructors
        Students student1 = new Students();
        Students student2 = new Students(1, "John Doe");
        Students student3 = new Students(2, "Jane Smith", 1234567890);

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.display();

        System.out.println("\nStudent 2 Details:");
        student2.display();

        System.out.println("\nStudent 3 Details:");
        student3.display();

        System.out.println("\nStudent 3 Details without mobile:");
        student3.display(false);
    }
}

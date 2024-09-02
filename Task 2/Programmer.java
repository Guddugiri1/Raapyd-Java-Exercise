public class Programmer {
    private int pcode;
    private String pname;
    private String skills;

    // Constructor to initialize data members
    public Programmer(int pcode, String pname, String skills) {
        this.pcode = pcode;
        this.pname = pname;
        this.skills = skills;
    }

    // Copy constructor to copy details from another Programmer object
    public Programmer(Programmer other) {
        this.pcode = other.pcode;
        this.pname = other.pname;
        this.skills = other.skills;
    }

    // Method to display all details of the programmer
    public void display() {
        System.out.println("Programmer Code: " + pcode);
        System.out.println("Programmer Name: " + pname);
        System.out.println("Skills: " + skills);
    }

    // Overloaded method to display details of the programmer based on pcode
    public void display(int pcode) {
        if (this.pcode == pcode) {
            System.out.println("Programmer Code: " + this.pcode);
            System.out.println("Programmer Name: " + this.pname);
            System.out.println("Skills: " + this.skills);
        } else {
            System.out.println("No programmer found with the given code: " + pcode);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Creating a Programmer object using the constructor
        Programmer programmer1 = new Programmer(101, "Alice", "Java, Python");

        // Creating another Programmer object using the copy constructor
        Programmer programmer2 = new Programmer(programmer1);

        // Displaying the details of the first programmer
        System.out.println("Programmer 1 Details:");
        programmer1.display();

        // Displaying the details of the second programmer (copied details)
        System.out.println("\nProgrammer 2 Details:");
        programmer2.display();

        // Displaying the details of the programmer based on pcode
        System.out.println("\nSearching for Programmer with pcode 101:");
        programmer1.display(101);

        System.out.println("\nSearching for Programmer with pcode 102:");
        programmer1.display(102);
    }
}

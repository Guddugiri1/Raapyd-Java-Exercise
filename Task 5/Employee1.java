// Employee1.java
class Employee1 {
    // Private attributes
    private int empno;
    private String ename;
    private double salary;

    // Default constructor
    public Employee1() {
        this.empno = 0;
        this.ename = "Unknown";
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employee1(int empno, String ename, double salary) {
        this.empno = empno;
        this.ename = ename;
        this.salary = salary;
    }

    // Copy constructor
    public Employee1(Employee1 emp) {
        this.empno = emp.empno;
        this.ename = emp.ename;
        this.salary = emp.salary;
    }

    // Getter methods
    public int getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee No: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Salary: " + salary);
    }

    // Overloaded method to display specific details
    public void display(String detail) {
        switch (detail.toLowerCase()) {
            case "empno":
                System.out.println("Employee No: " + empno);
                break;
            case "ename":
                System.out.println("Employee Name: " + ename);
                break;
            case "salary":
                System.out.println("Employee Salary: " + salary);
                break;
            default:
                System.out.println("Invalid detail requested!");
                break;
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        // Using the default constructor
        Employee1 emp1 = new Employee1();
        System.out.println("Employee created with default constructor:");
        emp1.display();

        // Using the parameterized constructor
        Employee1 emp2 = new Employee1(101, "John Doe", 50000.0);
        System.out.println("\nEmployee created with parameterized constructor:");
        emp2.display();

        // Using the copy constructor
        Employee1 emp3 = new Employee1(emp2);
        System.out.println("\nEmployee created with copy constructor:");
        emp3.display();

        // Using the overloaded display method
        System.out.println("\nDisplaying specific details:");
        emp3.display("empno");
        emp3.display("ename");
        emp3.display("salary");
    }
}

public class Medicine {
    // Private instance variables
    private String mCode;
    private String mName;
    private String manufacturer;

    // Default constructor
    public Medicine() {
        this.mCode = "Unknown";
        this.mName = "Unknown";
        this.manufacturer = "Unknown";
    }

    // Parameterized constructor
    public Medicine(String mCode, String mName, String manufacturer) {
        this.mCode = mCode;
        this.mName = mName;
        this.manufacturer = manufacturer;
    }

    // Copy constructor
    public Medicine(Medicine other) {
        this.mCode = other.mCode;
        this.mName = other.mName;
        this.manufacturer = other.manufacturer;
    }

    // Getter methods
    public String getMCode() {
        return mCode;
    }

    public String getMName() {
        return mName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    // Method overloading example
    public void printDetails() {
        System.out.println("Medicine Details:");
        System.out.println("Code: " + mCode);
        System.out.println("Name: " + mName);
        System.out.println("Manufacturer: " + manufacturer);
    }

    public void printDetails(String format) {
        if ("short".equals(format)) {
            System.out.println("Medicine Code: " + mCode);
            System.out.println("Name: " + mName);
        } else if ("long".equals(format)) {
            printDetails();
        } else {
            System.out.println("Unknown format");
        }
    }

    public static void main(String[] args) {
        // Using default constructor
        Medicine med1 = new Medicine();
        med1.printDetails(); // Print details using default constructor

        // Using parameterized constructor
        Medicine med2 = new Medicine("M123", "Paracetamol", "Pharma Inc.");
        med2.printDetails(); // Print details using parameterized constructor

        // Using copy constructor
        Medicine med3 = new Medicine(med2);
        med3.printDetails(); // Print details using copy constructor

        // Method overloading
        med2.printDetails("short"); // Short format
        med2.printDetails("long"); // Long format
    }
}

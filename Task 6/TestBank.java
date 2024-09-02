// TestBank.java
public class TestBank {
    public static void main(String[] args) {
        // Creating references of type RBI for each bank
        RBI axisBank = new AXIS();
        RBI sbiBank = new SBI();
        RBI hdfcBank = new HDFC();

        // Accessing getRateOfInterest() using RBI references
        System.out.println("AXIS Bank Rate of Interest: " + axisBank.getRateOfInterest() + "%");
        System.out.println("SBI Bank Rate of Interest: " + sbiBank.getRateOfInterest() + "%");
        System.out.println("HDFC Bank Rate of Interest: " + hdfcBank.getRateOfInterest() + "%");
    }
}

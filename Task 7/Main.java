// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Creating instances of SBI and PNB
        RBI sbi = new SBI();
        RBI pnb = new PNB();

        // Displaying the rate of interest for both banks
        System.out.println("SBI Rate of Interest: " + sbi.getRateOfInterest() + "%");
        System.out.println("PNB Rate of Interest: " + pnb.getRateOfInterest() + "%");
    }
}
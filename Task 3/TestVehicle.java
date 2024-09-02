// TestVehicle.java
public class TestVehicle {
    public static void main(String[] args) {
        // Creating objects of child classes using Vehicle reference
        Vehicle car = new Car();
        Vehicle rikshaw = new Rikshaw();
        Vehicle bus = new Bus();

        // Accessing the noOfWheels method of each vehicle
        System.out.println("Car:");
        car.noOfWheels();

        System.out.println("\nRikshaw:");
        rikshaw.noOfWheels();

        System.out.println("\nBus:");
        bus.noOfWheels();
    }
}

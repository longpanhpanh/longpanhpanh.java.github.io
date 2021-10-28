public class Vehicle {
    String name;
    double speed;
    String model;

    Vehicle(String vehicleName, String vehicleModel, int vehicleSpeed) {
        name = vehicleName;
        model = vehicleModel;
        speed = vehicleSpeed;
    }

    @Override
    public String toString() {
        return name + " - " + model + " - " + speed;
    }
}

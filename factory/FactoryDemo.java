package factory;

public class FactoryDemo {
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle("car");
        car.drive();

        Vehicle bike = VehicleFactory.createVehicle("bike");
        bike.drive();

        Vehicle truck = VehicleFactory.createVehicle("truck");
        truck.drive();
    }
}
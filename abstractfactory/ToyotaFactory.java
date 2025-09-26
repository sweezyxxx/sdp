package abstractfactory;

public class ToyotaFactory implements VehicleFactoryAF {
    @Override
    public CarAF createCar() {
        return new ToyotaCar();
    }

    @Override
    public TruckAF createTruck() {
        return new ToyotaTruck();
    }
}

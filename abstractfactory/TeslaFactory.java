package abstractfactory;

public class TeslaFactory implements VehicleFactoryAF {
    @Override
    public CarAF createCar() {
        return new TeslaCar();
    }

    @Override
    public TruckAF createTruck() {
        return new TeslaTruck();
    }
}

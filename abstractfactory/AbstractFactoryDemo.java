package abstractfactory;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactoryAF toyotaFactory = new ToyotaFactory();
        CarAF toyotaCar = toyotaFactory.createCar();
        TruckAF toyotaTruck = toyotaFactory.createTruck();
        toyotaCar.assemble();
        toyotaTruck.assemble();

        VehicleFactoryAF teslaFactory = new TeslaFactory();
        CarAF teslaCar = teslaFactory.createCar();
        TruckAF teslaTruck = teslaFactory.createTruck();
        teslaCar.assemble();
        teslaTruck.assemble();
    }
}

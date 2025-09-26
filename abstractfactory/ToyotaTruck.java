package abstractfactory;

public class ToyotaTruck implements TruckAF {
    @Override
    public void assemble() {
        System.out.println("Assembling a Toyota Truck for heavy duty.");
    }
}

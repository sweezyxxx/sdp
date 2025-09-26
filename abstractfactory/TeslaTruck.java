package abstractfactory;

public class TeslaTruck implements TruckAF {
    @Override
    public void assemble() {
        System.out.println("Assembling a Tesla Cybertruck.");
    }
}

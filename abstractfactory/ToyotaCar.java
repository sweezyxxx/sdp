package abstractfactory;

public class ToyotaCar implements CarAF {
    @Override
    public void assemble() {
        System.out.println("Assembling a Toyota Car with fuel engine.");
    }
}

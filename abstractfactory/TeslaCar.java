package abstractfactory;

public class TeslaCar implements CarAF {
    @Override
    public void assemble() {
        System.out.println("Assembling a Tesla Car with electric motor.");
    }
}

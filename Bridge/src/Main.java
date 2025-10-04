import devices.*;
import remotes.*;

public class Main {
    public static void main(String[] args) {
        Device tv = new TV();
        Device radio = new Radio();

        Remote basicRemote = new BasicRemote(tv);
        Remote advancedRemote = new AdvancedRemote(radio);

        System.out.println("--- Testing TV with Basic Remote ---");
        basicRemote.power();
        basicRemote.volumeUp();
        basicRemote.volumeDown();
        basicRemote.power();

        System.out.println("\n--- Testing Radio with Advanced Remote ---");
        advancedRemote.power();
        advancedRemote.volumeUp();
        ((AdvancedRemote) advancedRemote).mute();
        advancedRemote.power();
    }
}

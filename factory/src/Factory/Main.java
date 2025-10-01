package Factory;

public class Main {
    public static void main(String[] args) {
        Dialog dialog;

        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new MacDialog();
        }

        dialog.renderWindow();
    }
}

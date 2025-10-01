package Factory;

class MacDialog extends Dialog {
    public Button createButton() {
        return new MacButton();
    }
}
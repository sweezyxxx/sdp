package Factory;

abstract class Dialog {
    public void renderWindow() {
        // Используем фабричный метод
        Button okButton = createButton();
        okButton.render();
    }

    // Фабричный метод
    public abstract Button createButton();
}
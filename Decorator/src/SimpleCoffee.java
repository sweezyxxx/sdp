public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {
        return "Кофе";
    }

    @Override
    public int getCost() {
        return 500;
    }
}
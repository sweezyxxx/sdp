public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " = " + coffee.getCost() + " тг");

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " = " + coffee.getCost() + " тг");

        coffee = new SugarDecorator(coffee);
        System.out.println(coffee.getDescription() + " = " + coffee.getCost() + " тг");
    }
}

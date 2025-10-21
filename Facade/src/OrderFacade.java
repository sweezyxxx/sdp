public class OrderFacade {
    private CoffeeMaker coffeeMaker;
    private PaymentSystem paymentSystem;

    public OrderFacade() {
        this.coffeeMaker = new CoffeeMaker();
        this.paymentSystem = new PaymentSystem();
    }

    public void placeOrder(String coffeeType, int paymentAmount) {
        coffeeMaker.makeCoffee(coffeeType);
        paymentSystem.processPayment(paymentAmount);
        System.out.println("Ваш заказ готов!");
    }
}
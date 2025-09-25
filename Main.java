public class Main {
    public static void main(String[] args) {
        Car myCar = new Car.Builder()
                .setMake("Dodge")
                .setModel("Mustang")
                .setYear(2010)
                .setColor("Blue")
                .setIsElectric(true)
                .build();

        myCar.setColor("Black");
        
        System.out.println(myCar);
    }
}
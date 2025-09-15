public class Car {
    private final String make;
    private final String model;
    private final int year;
    private final String color;
    private final boolean isElectric;

    private Car(Builder builder) {
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
        this.isElectric = builder.isElectric;
    }

    public static class Builder {
        private String make;
        private String model;
        private int year;
        private String color;
        private boolean isElectric;

        public Builder setMake(String make) {
            this.make = make;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setYear(int year) {
            this.year = year;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setIsElectric(boolean isElectric) {
            this.isElectric = isElectric;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return String.format("Car: %s %s (%d)\nColor: %s\nElectric: %b",
            make, model, year, color, isElectric);
    }
}
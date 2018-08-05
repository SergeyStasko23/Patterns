package pattern.creational.builder;

/*
    1. Builder делает акцент на пошаговом конструкировании объекта.
    2. Builder возвращает продукт на последнем шаге.
    3. Отделяет конструирование сложного объекта от его представления,
        так что в результате одного и того же процесса конструирования
        могут получаться разные представления.
*/

public class MainBuilder {
    public static void main(String[] args) {
        SportCar sportCar = new SportCar.Builder("Nissan").setColor("Silver").setMaxSpeed(800).build();

        System.out.println(sportCar.getName());
        System.out.println(sportCar.getColor());
        System.out.println(sportCar.getMaxSpeed());
    }
}

class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    private SportCar(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.maxSpeed = builder.maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    static class Builder {
        private String name;
        private String color;
        private int maxSpeed;

        // В конструкторе указывается поле, обязательное для объекта
        public Builder(String name) {
            this.name = name;
        }

        // Setters должны возвращать Builder
        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public SportCar build() {
            return new SportCar(this);
        }
    }
}

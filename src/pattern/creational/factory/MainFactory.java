package pattern.creational.factory;

// Factory выпускает продукты определенного типа

public class MainFactory {
    public static void main(String[] args) {
        // Объект фабрики
        Factory factory = new Factory();

        // Каждый создаваемый объект обладает типом интерфейса
        Guitar gibson = factory.create("Gibson");
        Guitar fender = factory.create("Fender");

        gibson.play();
        fender.play();
    }
}

interface Guitar {
    void play();
}

class Gibson implements Guitar {
    @Override
    public void play() {
        System.out.println("Gibson play()");
    }
}

class Fender implements Guitar {
    @Override
    public void play() {
        System.out.println("Fender play()");
    }
}

// Фабрика создает гитары
class Factory {
    public Guitar create(String typeOfGuitar) {
        switch (typeOfGuitar) {
            case "Gibson" : return new Gibson();
            case "Fender" : return new Fender();
            default : return null;
        }
    }
}

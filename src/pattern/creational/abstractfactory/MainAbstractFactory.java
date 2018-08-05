package pattern.creational.abstractfactory;

/*
    1. AbstractFactory инкапсулирует реализацию фабрик для клиента.
    2. AbstractFactory объявляет только интерфейс для создания продуктов.
    3. ConcreteFactory - это GuitarFactory и CarFactory. Описываются при помощи Singleton.
    4. Создание каждого продукта осуществляется с помощью FactoryMethod (здесь switch-аналогия).
    5. Если семейств продуктов много, то ConcreteFactory реализовать при помощи Prototype,
        тогда ConcreteFactory инициализируется экземпляром-прототипом каждого продукта в семействе,
        и новый продукт создается путем клонирования этого прототипа.
*/

public class MainAbstractFactory {
    public static void main(String[] args) {
        // Создание фабрики машин, фабрики гитар
        Factory carFactory = new AbstractFactory().createFactory("Car");
        Factory guitarFactory = new AbstractFactory().createFactory("Guitar");

        // Создание машин с помощью фабрики машин
        Car nissan = carFactory.createCar("Nissan");
        Car lada = carFactory.createCar("Lada");

        // Создание гитар с помощью фабрики гитар
        Guitar esp = guitarFactory.createGuitar("Esp");
        Guitar musicMan = guitarFactory.createGuitar("Music Man");

        // Вызов метода для каждой машины
        nissan.go();
        lada.go();

        // Вызов метода для каждой гитары
        esp.play();
        musicMan.play();
    }
}

/* GuitarFactory */
interface Guitar {
    void play();
}

class Esp implements Guitar {
    @Override
    public void play() {
        System.out.println("Esp play()");
    }
}

class MusicMan implements Guitar {
    @Override
    public void play() {
        System.out.println("Music Man play()");
    }
}

class GuitarFactory implements Factory {
    public Guitar createGuitar(String typeOfGuitar) {
        switch (typeOfGuitar) {
            case "Esp" : return new Esp();
            case "Music Man" : return new MusicMan();
            default : return null;
        }
    }

    @Override
    public Car createCar(String typeOfCar) {
        return null;
    }
}

/* CarFactory */
interface Car {
    void go();
}

class Nissan implements Car {
    @Override
    public void go() {
        System.out.println("Nissan go()");
    }
}

class Lada implements Car {
    @Override
    public void go() {
        System.out.println("Lada go()");
    }
}

class CarFactory implements Factory {
    public Car createCar(String typeOfCar) {
        switch (typeOfCar) {
            case "Nissan" : return new Nissan();
            case "Lada" : return new Lada();
            default : return null;
        }
    }

    @Override
    public Guitar createGuitar(String typeOfGuitar) {
        return null;
    }
}

interface Factory {
    Guitar createGuitar(String typeOfGuitar);
    Car createCar(String typeOfCar);
}

class AbstractFactory {
    Factory createFactory(String typeOfFactory) {
        switch(typeOfFactory) {
            case "Car" : return new CarFactory();
            case "Guitar" : return new GuitarFactory();
            default : return null;
        }
    }
}

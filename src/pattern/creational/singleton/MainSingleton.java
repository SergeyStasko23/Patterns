package pattern.creational.singleton;

// Singleton - у класса может быть только один экземпляр

public class MainSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}

class Singleton {
    // Заранее, вручную созданный, единственный объект класса
    private static Singleton singleton = new Singleton();

    // конструктор закрывается для запрета создания объектов
    private Singleton() {}

    // получить единственный объект класса
    public static Singleton getInstance() {
        return singleton;
    }
}

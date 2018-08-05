package pattern.creational.factorymethod;

/*
    для создания объекта используется не конструктор,
    а метод create(), который возвращает объект класса
*/

public class MainFactoryMethod {
    public static void main(String[] args) {
        Manager manager = Manager.createManager("Alexander", 23);
    }
}

class Manager {
    String name;
    int age;

    private Manager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static Manager createManager(String name, int age) {
        return new Manager(name, age);
    }
}

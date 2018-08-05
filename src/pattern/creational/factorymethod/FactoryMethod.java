package pattern.creational.factorymethod;

/*
    ВАРИАНТЫ РЕАЛИЗАЦИИ:
    1. Для создания объекта каждого ConcreteProduct создается отдельный производный класс от Creator.
    2. Создается универсальный метод с использованием switch.
    3. Создается метод, в котором создается перечень методов, которые создают и возвращают определенный объект.
    4. Фабричные методы называть по шаблону doMakeClass(), где Class - название продукта
*/

public class FactoryMethod {
    public static void main(String[] args) {
        ConcreteCreator concreteCreator = new ConcreteCreator();
        Product productA = concreteCreator.doMakeConcreteProduct("Concrete Product A");
        Product productB = concreteCreator.doMakeConcreteProduct("Concrete Product B");

        productA.write();
        productB.write();
    }
}

interface Product {
    void write();
}

class ConcreteProductA implements Product {
    public void write() {
        System.out.println("ConcreteProductA");
    }
}

class ConcreteProductB implements Product{
    public void write() {
        System.out.println("ConcreteProductB");
    }
}

abstract class Creator {
    public abstract Product doMakeConcreteProduct(String typeOfClass);
}

class ConcreteCreator extends Creator {
    @Override
    public Product doMakeConcreteProduct(String typeOfClass) {
        switch(typeOfClass) {
            case "Concrete Product A" : return new ConcreteProductA();
            case "Concrete Product B" : return new ConcreteProductB();
            default : return null;
        }
    }
}
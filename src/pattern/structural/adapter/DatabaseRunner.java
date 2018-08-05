package pattern.structural.adapter;

/*
    1. Применяется для обеспечения совместной работы классов, интерфейсы которых несовместимы.
    2. Адаптер класса использует множественное наследование для адаптации одного интерфейса к другому.
    3. Адаптер объекта применяет композицию объектов.
 */

// Client - клиент
public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}

// Target - целевой
interface Database {
    void insert();
    void update();
    void select();
    void remove();
}

// Adaptee - адаптируемый
class JavaApplication {
    public void saveObject() {
        System.out.println("Saving java object...");
    }

    public void updateObject() {
        System.out.println("Updating java object...");
    }

    public void loadObject() {
        System.out.println("Loading java object...");
    }

    public void deleteObject() {
        System.out.println("Deleting java object...");
    }
}

// Adapter - адаптер
class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();
    }

    @Override
    public void update() {
        updateObject();
    }

    @Override
    public void select() {
        loadObject();
    }

    @Override
    public void remove() {
        deleteObject();
    }
}

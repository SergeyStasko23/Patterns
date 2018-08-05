package pattern.structural.bridge;

/*
    1. Отделяет абстракцию от ее реализации так, чтобы то и другое можно было изменять независимо.
    2. Мост устанавливается между иерархией классов Program и иерархией классов Developer
        путем хранения ссылки типа Developer в классе Program.
    3. Устраняет постоянную привязку абстракции к реализации.
 */

public class ProgramCreator {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new JavaDeveloper()),
                new StockExchange(new CppDeveloper())
        };

        for(Program program : programs) {
            program.developProgram();
        }
    }
}

/* Program и реализации */
abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    public abstract void developProgram();
}

class BankSystem extends Program {
    public BankSystem(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System development in progress...");
        developer.writeCode();
    }
}

class StockExchange extends Program {
    public StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Exchange development in progress...");
        developer.writeCode();
    }
}

/* Developer и реализации интерфейса */
interface Developer {
    void writeCode();
}

class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}

class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}
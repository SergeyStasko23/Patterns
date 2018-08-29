package pattern.behavioral.strategy;

/*
    ConcreteStrategy - конкретная стратегия.
 */
public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Coding...");
    }
}

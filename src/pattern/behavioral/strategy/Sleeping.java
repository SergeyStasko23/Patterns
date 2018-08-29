package pattern.behavioral.strategy;

/*
    ConcreteStrategy - конкретная стратегия.
 */
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}

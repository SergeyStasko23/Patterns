package pattern.behavioral.strategy;

/*
    ConcreteStrategy - конкретная стратегия.
 */
public class Reading implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Reading...");
    }
}

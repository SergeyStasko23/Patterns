package pattern.behavioral.strategy;

/*
    ConcreteStrategy - конкретная стратегия.
 */
public class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}

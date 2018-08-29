package pattern.behavioral.state;

/*
    ConcreteState - конкретное состояние.
*/
public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}

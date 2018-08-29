package pattern.behavioral.state;

/*
    ConcreteState - конкретное состояние.
*/
public class Training implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Training...");
    }
}

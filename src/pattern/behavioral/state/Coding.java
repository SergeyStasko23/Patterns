package pattern.behavioral.state;

/*
    ConcreteState - конкретное состояние.
*/
public class Coding implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Writing code...");
    }
}

package pattern.structural.flyweight;

// ConcreteFlyweight - конкретный приспособленец. В его объекте хранится внутреннее состояние.
public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes java code...");
    }
}

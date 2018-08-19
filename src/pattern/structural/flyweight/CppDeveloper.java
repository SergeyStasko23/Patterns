package pattern.structural.flyweight;

// ConcreteFlyweight - конкретный приспособленец. В его объекте хранится внутреннее состояние.
public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes c++ code...");
    }
}

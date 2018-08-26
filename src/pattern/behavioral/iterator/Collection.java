package pattern.behavioral.iterator;

// Aggregate - определяет интерфейс для создания объекта агрегата.
public interface Collection {
    Iterator getIterator();
}

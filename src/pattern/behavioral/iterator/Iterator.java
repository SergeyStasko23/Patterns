package pattern.behavioral.iterator;

/*
    Iterator.
    Идея: за доступ к элементам и способ обхода отвечает не сам список, а отдельный объект итератор.
 */
public interface Iterator {
    boolean hasNext();
    Object next();
}

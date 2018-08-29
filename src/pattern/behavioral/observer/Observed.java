package pattern.behavioral.observer;

/*
    Subject - субъект.
    Предоставляет интерфейс для присоединения и отделения наблюдателей.
    Уведомляет наблюдателей об изменениях.
 */
public interface Observed {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

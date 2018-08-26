package pattern.behavioral.mediator;

/*
    Mediator - определяет интерфейс для обмена информацией с объектами Colleague.
*/
public interface Chat {
    void sendMessage(String message, User user);
}

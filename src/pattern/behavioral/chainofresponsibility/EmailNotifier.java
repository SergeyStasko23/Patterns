package pattern.behavioral.chainofresponsibility;

/*
    ConcreteHandler - конкретный обработчик.
    Обрабатывает запрос, за который отвечает.
    Имеет доступ к своему преемнику.
*/

public class EmailNotifier extends Notifier {
    public EmailNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending email: " + message);
    }
}

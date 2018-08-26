package pattern.behavioral.chainofresponsibility;

/*
    ConcreteHandler - конкретный обработчик.
    Обрабатывает запрос, за который отвечает.
    Имеет доступ к своему преемнику.
*/
public class SMSNotifier extends Notifier {
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Sending SMS to manager: " + message);
    }
}

package pattern.behavioral.chainofresponsibility;

/*
    ConcreteHandler - конкретный обработчик.
    Обрабатывает запрос, за который отвечает.
    Имеет доступ к своему преемнику.
*/
public class SimpleReportNotifier extends Notifier {
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("Notifying using simple report: " + message);
    }
}

package pattern.behavioral.chainofresponsibility;

/*
    Идея: разорвать связь между отправителями и получателями, дав возможность обработать запрос нескольким объектам.
    У объекта, отправившего запрос, отсутствует информация об обработчике - анонимном получателе.
 */

// Client - отправляет запрос некоторому объекту ConcreteHandler в цепочке.
public class BugTracker {
    public static void main(String[] args) {
        Notifier reportNotifier = new SimpleReportNotifier(Priority.ROUTINE);
        Notifier emailNotifier = new EmailNotifier(Priority.IMPORTANT);
        Notifier smsNotifier = new SMSNotifier(Priority.ASAP);

        reportNotifier.setNextNotifier(emailNotifier);
        emailNotifier.setNextNotifier(smsNotifier);

        reportNotifier.notifyManager("Everything is OK.", Priority.ROUTINE);
        System.out.println();
        reportNotifier.notifyManager("Something went wrong!", Priority.IMPORTANT);
        System.out.println();
        reportNotifier.notifyManager("Houston, we have problems", Priority.ASAP);
    }
}

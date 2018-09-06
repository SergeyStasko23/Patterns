package pattern.web.businessdelegate;

public class Run {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.doTask("jms");
    }
}

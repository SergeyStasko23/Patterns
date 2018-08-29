package pattern.behavioral.templatemethod;

/*
    ConcreteClass - конкретный класс.
*/
public class WelcomePage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("Welcome");
    }
}

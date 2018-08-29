package pattern.behavioral.templatemethod;

/*
    ConcreteClass - конкретный класс.
*/
public class NewsPage extends WebsiteTemplate {
    @Override
    public void showPageContent() {
        System.out.println("News");
    }
}

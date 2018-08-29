package pattern.behavioral.templatemethod;

/*
    AbstractClass - определяет абстрактные примитивные операции, замещаемые в конкретных подклассах для реализации шагов алгоритма.
*/
public abstract class WebsiteTemplate {
    public void showPage() {
        System.out.println("Header");
        showPageContent();
        System.out.println("Footer");
    }

    public abstract void showPageContent();
}

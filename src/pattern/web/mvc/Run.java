package pattern.web.mvc;

public class Run {
    public static void main(String[] args) {
        Controller controller = new StudentController();
        controller.execute();
    }
}

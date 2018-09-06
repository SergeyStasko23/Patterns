package pattern.web.mvc;

public interface Controller {
    void execute();
}

class StudentController implements Controller {
    private Model model = new DB();
    private View view = new HtmlView();

    @Override
    public void execute() {
        Student student = model.getStudent();
        view.showStudent(student);
    }
}

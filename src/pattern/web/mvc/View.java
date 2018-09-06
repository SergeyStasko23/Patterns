package pattern.web.mvc;

public interface View {
    void showStudent(Student student);
}

class ConsoleView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("Student name: " + student.getName() + " Student age: " + student.getAge());
    }
}

class HtmlView implements View {
    @Override
    public void showStudent(Student student) {
        System.out.println("<html><body> Student name: " + student.getName() + " age: " + student.getAge() + " </body></html>");
    }
}

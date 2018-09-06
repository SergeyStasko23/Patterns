package pattern.web.mvc;

public interface Model {
    Student getStudent();
}

class DB implements Model {
    @Override
    public Student getStudent() {
        return new Student();
    }
}

class File implements Model{
    @Override
    public Student getStudent() {
        return new Student();
    }
}

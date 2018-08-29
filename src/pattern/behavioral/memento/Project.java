package pattern.behavioral.memento;

import java.util.Date;

/*
    Originator - хозяин.
    Создает хранителя, содержащего снимок текущего внутреннего состояния.
 */
public class Project {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "Project:\n" +
                "\nVersion: " + version +
                "\nDate: " + date + "\n";
    }
}

package pattern.behavioral.memento;

import java.util.Date;

/*
    Memento - хранитель - объект, в котором сохраняется внутреннее состояние другого объекта - хозяина хранителя.
*/
public class Save {
    private final String version;
    private final Date date;

    public Save(String version) {
        this.version = version;
        this.date = new Date();
    }

    public String getVersion() {
        return version;
    }

    public Date getDate() {
        return date;
    }
}

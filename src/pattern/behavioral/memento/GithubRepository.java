package pattern.behavioral.memento;

/*
    Caretaker - посыльный. Отвечает за сохранение хранителя.
    Не производит никаких операций над хранителем и не исследует его внутреннее содержимое.
 */
public class GithubRepository {
    private Save save;

    public Save getSave() {
        return save;
    }

    public void setSave(Save save) {
        this.save = save;
    }
}

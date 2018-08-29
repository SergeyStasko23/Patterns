package pattern.behavioral.observer;

import java.util.List;

/*
    Observer - наблюдатель.
    Определяет интерфейс обновления для объектов, которые должны быть уведомлены об изменении субъекта.
*/
public interface Observer {
    void handleEvent(List<String> vacancies);
}

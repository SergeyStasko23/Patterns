package pattern.structural.facade;

/*
    Facade - позволяет отделить подсистему как от клиентов,
    так и от других подсистем,
    что способствует повышению стенепи независимости и переносимости.

    Позволяет разложить подсистему на отдельные слои,
    использовать фадал для определения точки входа на каждый уровень подсистемы.

    Степень связанности можно уменьшить, если сделать класс Facade абстрактным.

    Объекты фасадов часто бывают одиночками, так как обычно требуется только один фасад.
*/
public class Workflow {
    Developer developer = new Developer();
    Job job = new Job();
    BugTracker bugTracker = new BugTracker();

    public void solveProblems() {
        job.dojob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadline(bugTracker);
    }
}

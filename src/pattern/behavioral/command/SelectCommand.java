package pattern.behavioral.command;

/*
    ConcreteCommand - конкретная команда.
    Реализует execute()
 */
public class SelectCommand implements Command {
    Database database;

    public SelectCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.select();
    }
}

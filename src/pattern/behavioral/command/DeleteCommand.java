package pattern.behavioral.command;

/*
    ConcreteCommand - конкретная команда.
    Реализует execute()
 */
public class DeleteCommand implements Command {
    Database database;

    public DeleteCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.delete();
    }
}

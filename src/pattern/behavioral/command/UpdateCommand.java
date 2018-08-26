package pattern.behavioral.command;

/*
    ConcreteCommand - конкретная команда.
    Реализует execute()
 */
public class UpdateCommand implements Command {
    Database database;

    public UpdateCommand(Database database) {
        this.database = database;
    }

    @Override
    public void execute() {
        database.update();
    }
}

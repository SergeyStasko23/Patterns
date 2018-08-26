package pattern.behavioral.interpreter;

/*
    TerminalExpression - терминальное выражение.
    Реализует операцию interpret() для терминальных символов грамматики.
*/
public class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        if(context.contains(data)) {
            return true;
        }
        return false;
    }
}

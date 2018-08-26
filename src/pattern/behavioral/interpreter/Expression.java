package pattern.behavioral.interpreter;

/*
    AbstractExpression - абстрактное выражение.
    Объявляет абстрактную операцию Interpret, общую для всех узлов в абстрактном синтаксическом дереве.
 */
public interface Expression {
    boolean interpret(String context);
}

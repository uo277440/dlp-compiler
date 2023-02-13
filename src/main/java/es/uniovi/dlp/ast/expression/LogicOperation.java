package es.uniovi.dlp.ast.expression;

public class LogicOperation extends AbstractExpression{
    private String op;
    private Expression leftExpression;
    private Expression rightExpression;
    public LogicOperation(int line, int column) {
        super(line, column);
    }
}

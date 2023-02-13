package es.uniovi.dlp.ast.expression;

public class DoubleLiteral extends AbstractExpression{
    private double value;
    public DoubleLiteral(int line, int column) {
        super(line, column);
    }
}

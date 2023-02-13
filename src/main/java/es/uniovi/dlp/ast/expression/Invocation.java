package es.uniovi.dlp.ast.expression;

import java.util.List;

public class Invocation extends AbstractExpression{
    private List<Expression> arguments;
    public Invocation(int line, int column) {
        super(line, column);
    }
}

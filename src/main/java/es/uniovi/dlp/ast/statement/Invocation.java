package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

import java.util.List;

public class Invocation extends AbstractStatement{
    List<Expression> arguments;
    public Invocation(int line, int column) {
        super(line, column);
    }
}

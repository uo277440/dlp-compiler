package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

import java.util.List;

public class While extends AbstractStatement{
    private Expression condition;
    private List<Statement> body;
    public While(int line, int column) {
        super(line, column);
    }
}

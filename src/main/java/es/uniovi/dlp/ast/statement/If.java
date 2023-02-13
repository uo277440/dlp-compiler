package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;

import java.util.List;

public class If extends AbstractStatement{
    private Expression condition;
    private List<Statement> body;
    private List<Statement> elseBody;
    public If(int line, int column) {
        super(line, column);
    }
}

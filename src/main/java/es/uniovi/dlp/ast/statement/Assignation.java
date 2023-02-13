package es.uniovi.dlp.ast.statement;

import es.uniovi.dlp.ast.expression.Expression;
import es.uniovi.dlp.ast.expression.Variable;

public class Assignation extends AbstractStatement{
    private Variable left;
    private Expression right;
    public Assignation(int line, int column) {
        super(line, column);
    }
}

package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.type.Type;

public class Variable extends AbstractExpression{
    private String name;
    private Type type;
    public Variable(int line, int column) {
        super(line, column);
    }
}

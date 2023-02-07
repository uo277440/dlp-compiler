package es.uniovi.dlp.ast.expression;

import es.uniovi.dlp.ast.AbstractASTNode;



public class AbstractExpression extends AbstractASTNode implements Expression {

    public AbstractExpression(int line, int column) {
        super(line, column);
    }
}

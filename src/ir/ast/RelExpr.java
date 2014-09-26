/**
 * Copyright (C) 2014
 * All rights reserved.
 *
 * File Name: RelExpr.java
 * Project: Compilador
 * Authors: Astorga Dario - Marconi Pablo
 * Version: 0.1 
 */
package ir.ast;
import ir.ASTVisitor;

public class RelExpr extends BinOpExpr {
    public RelExpr() {
        super();
        type = Type.TBOOLEAN;
    }

	public RelExpr(Expression l, BinOpType op, Expression r){
	    super(l, r);
        super.operator = op;
        type = Type.TBOOLEAN;
	}
	
	public RelExpr(BinOpType op){
        super.operator = op;
        type = Type.TBOOLEAN;
	}
	
	@Override
	public String toString() {
		return this.lOperand + " " + this.operator + " " + this.rOperand;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
	
}
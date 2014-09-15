package ir;

import ir.ast.*;

// Abstract visitor
public interface ASTVisitor<T> {
// visit statements
	T visit(AssignStmt stmt);
	T visit(ReturnStmt stmt);
	T visit(IfStmt stmt);
	
// visit expressions
	T visit(BinOpExpr expr);;
	
// visit literals	
	T visit(IntLiteral lit);
	T visit(FloatLiteral lit);

// visit locations	
	T visit(VarLocation loc);

// Visit block
	T visit(Block block);
}

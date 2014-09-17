package ir;

import ir.ast.*;

// Abstract visitor
public interface ASTVisitor<T> {
// visit statements
	T visit(AssignStmt stmt);
	T visit(ReturnStmt stmt);
	T visit(IfStmt stmt);
	T visit(ForStmt stmt);
	T visit(BreakStmt stmt);
	T visit(ContinueStmt stmt);
	T visit(SemicolonStmt stmt);
	T visit(WhileStmt stmt);
	T visit(LoopStmt stmt);
	T visit(MethodCallStmt stmt);
	
// visit expressions
	T visit(BinOpExpr expr);
	T visit(MethodCallExpr expr);
	
// visit literals	
	T visit(IntLiteral lit);
	T visit(FloatLiteral lit);
	T visit(BoolLiteral lit);

// visit locations	
	T visit(VarLocation loc);

// Visit block
	T visit(Block block);
}
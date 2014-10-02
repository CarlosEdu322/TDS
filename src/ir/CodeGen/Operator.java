/**
 * Copyright (C) 2014
 * All rights reserved.
 *
 * File Name: Operator.java
 * Project: Compilador
 * Authors: Astorga Dario - Marconi Pablo
 * Version: 0.1 
 * Description the class: Enumerado del operador del codigo de tres direcciones.
 */

package ir.CodeGen;

public enum Operator {
	PLUS, 
	MINUS,
	MULT,
	DIV,
	MOD,
	LT, 
	GT,
	LTEQ,
	GTEQ,
	EQEQ, 
	NOTEQ, 
	ANDAND,
	NOT,
	OROR,
	PLUSEQ,
	MINUSEQ,
	EQ,
	RET,
	CMP,
	JNE,
	JMP,
	LABEL,
	JGE,
	INC;
	
	@Override
	public String toString() {
		switch(this) {
			case PLUS:
				return "PLUS";
			case MINUS:
				return "MINUS";
			case MULT:
				return "MULT";
			case DIV:
				return "DIV";
			case MOD:
				return "MOD";
			case LT:
				return "LT";
			case GT:
				return "GT";
			case LTEQ:
				return "LTEQ";
			case GTEQ:
				return "GTEQ";
			case EQEQ:
				return "EQEQ";
			case NOTEQ:
				return "NOTEQ";
			case ANDAND:
				return "AND";
			case NOT:
				return "NOT";
			case OROR:
				return "OR";
			case PLUSEQ:
				return "PLUSEQ";
			case MINUSEQ:
				return "MINUSEQ";
			case EQ:
				return "EQ";
			case RET:
				return "RET";
			case CMP:
				return "CMP";
			case JNE:
				return "JNE";
			case JMP:
				return "JMP";
			case LABEL:
				return "LABEL";
		}
		return null;
	}
}
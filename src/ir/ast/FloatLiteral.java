/**
 * Copyright (C) 2014
 * All rights reserved.
 *
 * File Name: FloatLiteral.java
 * Authors: Astorga Dario - Marconi Pablo
 * Version: 0.1 
 */
package ir.ast;

import ir.ASTVisitor;

public class FloatLiteral extends Literal {
	private String rawValue;
	private Float value;
	
	/*
	 * Constructor for float literal that takes a string as an input
	 * @param: String float
	 */
	public FloatLiteral(String val){
		rawValue = val; // Will convert to float value in semantic check
		value = Float.parseFloat(val);
	}

	@Override
	public Type getType() {
		return Type.TFLOAT;
	}

	public String getStringValue() {
		return rawValue;
	}

	public void setStringValue(String stringValue) {
		this.rawValue = stringValue;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return rawValue;
	}

	@Override
	public <T> T accept(ASTVisitor<T> v) {
		return v.visit(this);
	}
} 
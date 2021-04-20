package com.nelioalves.cursomc.resources.exceptions;

import java.io.Serializable;

public class FieldMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fieldName;
	private String message;
	
	
	public FieldMessage() {
		
	}


	public FieldMessage(String fieldName, String mensagem) {
		super();
		this.fieldName = fieldName;
		this.message = mensagem;
	}


	public String getFieldName() {
		return fieldName;
	}


	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	
}

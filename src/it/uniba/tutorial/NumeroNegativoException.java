package it.uniba.tutorial;

public class NumeroNegativoException extends Exception {

	private static final long serialVersionUID = 1L;

	public NumeroNegativoException(String message){
		System.err.println(message);
	}
}

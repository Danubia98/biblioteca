package br.com.aceleragep.Biblioteca.exceptions;


public class NotFoundBussinessException extends BussinessException {

	private static final long serialVersionUID = 1L;

	public NotFoundBussinessException(String message) {
		super(message);
	}
}
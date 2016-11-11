package it.uniba.tutorial;

public class CollezioneVuotaException extends Exception {

	private static final long serialVersionUID = 1L;

	public CollezioneVuotaException(String message){
		System.err.println("Collezione vuota");
	}
}

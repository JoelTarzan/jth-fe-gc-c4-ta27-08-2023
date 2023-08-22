public class CustomException extends Exception {

	public CustomException() {
		super();
	}

	public String getMessage() {
		return "Esto es un objeto " + this.getClass();
	}
}
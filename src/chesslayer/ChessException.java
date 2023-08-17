package chesslayer;

public class ChessException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public ChessException() {
		super();
	}
	
	public ChessException(String message) {
		super(message);
	}
	
	public ChessException(String message, Throwable cause) {
		super(message, cause);
	}

}

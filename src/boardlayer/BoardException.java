package boardlayer;

public class BoardException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public BoardException() {
		super();
	}
	
	public BoardException(String message) {
		super(message);
	}
	
	public BoardException(String message, Throwable cause) {
		super(message, cause);
	}

}

package chesslayer;

import boardlayer.BoardException;

public class ChessException extends BoardException {
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

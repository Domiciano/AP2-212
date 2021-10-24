package exceptions;

public class InvalidNumberIdException extends Exception{
	
	/*Exception of incorrect day for client (If the client doesnt match with the condition of id 
	 * the program wont continue).
	 * </b> Pre: almostLastNumberId. </b>
	 */
	public InvalidNumberIdException(int almostLastNumberId) {
		super("Digito de la celuda incorrecto: El penultimo digito de la cedula debe ser distindo del dia (Par o impar). "
				+ "Digito incorreto ---> "+almostLastNumberId);
	}
	
}

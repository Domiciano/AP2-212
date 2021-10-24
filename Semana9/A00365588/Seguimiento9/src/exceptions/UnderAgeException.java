package exceptions;

public class UnderAgeException extends Exception{
	
	/*Exception of document type (If is under age program would not continue).
	 * </b> Pre: idType. </b>
	 */
	public UnderAgeException(String idType) {
		super("Tipo de documento incorrecto: Debe ser mayor de edad.");
		
	}
}

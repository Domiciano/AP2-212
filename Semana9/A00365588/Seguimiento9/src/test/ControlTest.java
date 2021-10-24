package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

import exceptions.InvalidNumberIdException;
import exceptions.UnderAgeException;
import model.Control;
import model.User;

class ControlTest {
	
	//Globals
	private Control users;
	
	/*	Scenarios 
	 * 	Initial test conditions
	 */
	
	//Scenary 2
	public void setupScenary2() {
		users = null;
	}
	
	//Scenary 3
	public void setupScenary3() throws UnderAgeException, InvalidNumberIdException {
		users = new Control();
	}
	
	//Scenary 4
	public void setupScenary4() throws UnderAgeException, InvalidNumberIdException {
		users = new Control();
		
		User A = new User("CC","66816574");
		User B = new User("PP","100456179");
		User C = new User("CE","456236574");
		
		users.getUsers().add(A);
		users.getUsers().add(B);
		users.getUsers().add(C);	
	}
	
	@Test
	public void createEmptyControl() throws UnderAgeException, InvalidNumberIdException {
		setupScenary2();
		users = new Control();
		assertNotNull(users.getUsers());
		assertEquals(users.getUsers().size(), 0);
	}
	
}

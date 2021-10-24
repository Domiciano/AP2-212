package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.UnderAgeException;
import model.User;

class UserTest {
	
	//Globals
	private User user;
	
	/*	Scenarios 
	 * 	Initial test conditions
	 */
	
	//Scenary 1
	public void setupScenary1() {
		user = null;
	}
	
	//Test cases
	@Test
	public void createUserTest() throws UnderAgeException {
		setupScenary1();
		user = new User("CC", "1005456987");
		assertEquals(user.getIdType(), "CC");
		assertEquals(user.getId(), "1005456987");
	}
	@Test
	public void createUnderAgeUserTest() throws UnderAgeException {
		setupScenary1();
		user = new User("TI", "1004426987");
		assertEquals(user.getIdType(), "TI");
		assertEquals(user.getId(), "1004426987");
	}
	
}

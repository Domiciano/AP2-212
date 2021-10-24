package model;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import exceptions.InvalidNumberIdException;
import exceptions.UnderAgeException;
import main.Main;

public class User {
	
	private String idType;
	private String id;
	
	public User(String idType, String id) throws UnderAgeException {
		this.idType = idType;
		this.id = id;
		if(idType.equals("TI")) { 
			throw new UnderAgeException(idType);
		}
		
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getAlmostLastNumberOfId() { 
		char charAlmostLastNumber = 0;
		int almostLastNumber = 0;
		for(int i=0; i<id.length();i++) {
			charAlmostLastNumber = id.charAt(i-1);
			almostLastNumber = charAlmostLastNumber - '0';
		}
		return almostLastNumber;
		
	}
	
	public void isAbleToBuy() throws InvalidNumberIdException {
		int day = 23;
		int almostLasNumberId = getAlmostLastNumberOfId();
		if(almostLasNumberId % 2 == 0 && day % 2 != 0) {
		} else {
			throw new InvalidNumberIdException(almostLasNumberId);
		}
	}
	
	public String getDay() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		SimpleDateFormat format = new SimpleDateFormat("dd");
		String actualDay = format.format(date);
		return actualDay;
	}
	
}

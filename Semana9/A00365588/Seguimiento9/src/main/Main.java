package main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import exceptions.InvalidNumberIdException;
import exceptions.UnderAgeException;
import model.Control;
import model.User;

public class Main {
	
	public static void main(String[] args) {
		
		try {
			Control control = new Control();
		} catch(InvalidNumberIdException e1) {
			e1.printStackTrace();
		} catch(UnderAgeException e2) {
			e2.printStackTrace();
		}finally {
			//Close the program
		}
		
	}
}

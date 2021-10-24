package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import exceptions.InvalidNumberIdException;
import exceptions.UnderAgeException;

public class Control {
	
	private ArrayList<User> users;	
	private Scanner in =  new Scanner(System.in); 
	private int answer1 = 0, answer2 = 0, visitors = 0;
	private boolean programFinished = false, stopMenu2 = false;
	private String idType = "", id = "";
	
	public Control() throws UnderAgeException, InvalidNumberIdException{
		users = new ArrayList<User>();
		while(programFinished==false) {
			visitors++;
			showMenu1();
			answer1 = in.nextInt();
			switch(answer1) {
				case 1:
					while(stopMenu2==false) {
						showMenu2();
						answer2 = in.nextInt();
						in.nextLine();
						if(answer2==1) {
							idType = "CC";
							stopMenu2 = true;
						}else if(answer2==2) {
							idType = "TI";
							stopMenu2 = true;
						}else if(answer2==3) {
							idType = "PP";
							stopMenu2 = true;
						}else if(answer2==4) {
							idType = "CE";
							stopMenu2 = true;
						}else {
							System.out.println("Escriba un numero correspondiente...");	
						}
					}
					showMenu3();
					id = in.nextLine();
					User user = new User(idType, id);
					user.isAbleToBuy();
					users.add(user);
					System.out.println("¡Persona creada exitosamente!");	
					System.out.println("");
					stopMenu2 = false;
					break;
				case 2:
					System.out.println("La cantidad total de visitantes del programa es: "+visitors);
					System.out.println("");
					break;
				case 3: 
					programFinished = true;
					break;
			}
			
			
			
		}
	}
	
	public void showMenu1() {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
		Date date = new Date();
		System.out.println("***************************");
		System.out.println("****Mi barrio te quiere****");
		System.out.println("***************************");
		System.out.println("Fecha actual: "+format.format(date)+"\n");
		System.out.println("~~~Menu~~~");
		System.out.println("1. Ingresar persona");
		System.out.println("2. Ver numero de personas que han visitado el programa");
		System.out.println("3. Salir");
	}
	
	public void showMenu2() {
		System.out.println("¿Cual es su tipo de documento? (Escriba el numero correspondiente)");
		System.out.println("1. CC");
		System.out.println("2. TI");
		System.out.println("3. PP");
		System.out.println("4. CE");
	}
	
	public void showMenu3() {
		System.out.print("Ahora, Ingrese su documento de identificacion ---> ");
	}
	
	public ArrayList<User> getUsers() {
		return users;
	}
	
}

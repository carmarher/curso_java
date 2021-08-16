//Este programa pregunta el nombre al usuario y lo saluda

import java.util.Scanner; //Library necesaria para usar la class Scanner

public class b_AskingTheUser {

	//Siempre se necesita a method main
	public static void main(String[] args) {	//Member: Method
		//Syntax for output
		System.out.println("What is your name?");
			
		//Syntax for input
		//Syntax for creating an object--> type identifier = new type();
		Scanner scanner = new Scanner(System.in); //Creamos la variable scanner que es un objeto del tipo Scanner
		String name = scanner.nextLine();
		//scanner.close(); //Cierra el objeto scanner abierto y evita el warning "scanner is never closed"
		
		System.out.println("Hola " + name);
		
	}

}

//Este código define la class User con 4 fields y 4 Methods
//No tiene class "main" por lo que no va a funcionar por sí mismo

import java.util.Scanner;

public class User {
	//Creating fields of a class
	public String firstName; //Field 1: firstName
	public String lastName; //Field 2: lastName
	public int age;
	public String password;
		
	//Creating a Method void called "output()"
	public void output() {
		System.out.println(firstName + " " + lastName);
	}
	
	public void output1(int times) {
		for (int i = 0; i < times; ++i) {
			System.out.println(firstName + " " + lastName);
		}
	}
	
	//Creating a Method String called "output2()"	
	public String output2() {
		return firstName + " " + lastName; //Como es de tipo String, devolverá en return una String
	}
	
	public void inputoutput() {
		System.out.println("Intruduce una frase:");
		Scanner scanner = new Scanner(System.in);
	    String mensaje = scanner.nextLine();
	    scanner.close(); //cierra el scanner abierto
		System.out.println("He introducido esto: " + mensaje);
	}
	
}

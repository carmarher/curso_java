//Este código contiene una segunda versión del resumen desordenado de todo el curso

import java.util.Scanner;

public class MySweetProgram2 {

	public static void main(String[] args) {
		//System.out.println("Hello there! What is your name"); //Printing on screen
		
		//creating variables as instances of classes --> Objects: type name = new type(), o bien: type name; name = new type();
		String string = new String("Esto es una frase");
		String string1 = "Esta manera es más directa"; //Creating strings easier
		String string2 = "Construyendo frases con expressions " + string1 + " :)"; //Crear string mediante una expresion de strings (concatenando)
		
		//creating variables from primitives: primitive type name; name = value; --> Declaring and initializing;
		int x = 5; //primitive
		int y; y = 6; // primitive
		
		//creating constants: final type name = value;
		final double PI = 3.14159;
		
		//getting input form user:
		//Scanner scanner = new Scanner(System.in);
		//String name = scanner.nextLine();		
		
		//System.out.println("Hello " + name);
		
		/*Using a created class "User"
		User usuario = new User();
		Scanner scanner = new Scanner(System.in);
		//String nombre_Usuario = scanner.nextLine(); Esto me lo puedo ahorrar
		//usuario.firstName = nombre_Usuario;
		System.out.println("Indique el nombre del usuario:");
		usuario.firstName = scanner.nextLine();
		System.out.println("Indique el apellido del usuario:");
		usuario.lastName = scanner.nextLine();
		System.out.println("El nombre completo del usuario es: " + usuario.output2());*/
		
		int[] grades; //declarando una array
		grades = new int[10]; // inicializando una array con tamaño y llena de 0 
		System.out.println(grades[8]);
	}
}

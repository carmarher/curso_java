//Este programa instancia la class User creando objetos
import java.util.Scanner;

public class e_ClassAndObject1 {

	public static void main(String[] args) {
		//Creating an Object usuario de la class User
		User usuario = new User(); // Instanciando la class User. Objeto usuario creado
		
		usuario.age = 30; //Asignando estáticamente valores a los atributos/fields de la class User
		usuario.password = "password";
		
		//Asignando dinámicamente valores a los fields de la class User:
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escribe tu nombre:");
		usuario.firstName = scanner.nextLine();
		System.out.println("Escribe tu apellido:");
		usuario.lastName = scanner.nextLine();
				
		//Output directamente desde este programa (esta class)
		System.out.println("Imprimimos directamente las variables asignadas:");
		System.out.println(usuario.firstName + " " + usuario.lastName);
		
		//Output mediante un método de la class User que hace lo mismo
		System.out.println("Imprimimos las variables asignadas mediante el method output() de class User:");
		usuario.output();
		
		//Output mediante un método de la class User con argumentos
		System.out.println("Define x:");
		int x = scanner.nextInt();
		System.out.println("Imprimimos x veces las variables asignadas mediante el method output1() de class User:");
		usuario.output1(x);	//Repite el output el número de veces indicado en el argumento
		
		//Output mediante un método String de la class User
		System.out.println("Imprimimos las variables asignadas mediante el method output2() de class User:");
		System.out.println(usuario.output2().toUpperCase()); //el method output2() devuelve una String directamente
		
		//Method overload: Output mediante un method del mismo nombre que el anterior pero con un parámetro diferente
		System.out.println("Imprimimos las variables asignadas mediante el method output2(boolean nice) de class User:");
		System.out.println(usuario.output2(true));
		System.out.println(usuario.output2(false));
		
		//Input mediante un método de la class User
		usuario.inputoutput();
		
		scanner.close(); //cerramos el scanner para evitar el warning
	}

}

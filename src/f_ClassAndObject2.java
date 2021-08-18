//Este programa crea objetos de la classe User2, que tiene fields privados, usando getters y setters

import java.util.ArrayList;
import java.util.List;

public class f_ClassAndObject2 {

	public static void main(String[] args) {
		//Using getter and setter with class User2 --> firstName (private) and lastName (public)
		User2 usuario1 = new User2(); //Definiendo un object user2 de la class User2
//		usuario.firstName = "Mikel"; //Esto no va a funcionar pq el field firstName está definido como private en la class User2, 
								   //y sólo los Methods de la class User2 pueden acceder a él --> Usaremos el setter-Method de esta class.
		usuario1.setFirstName("Mikel"); //setter-Method de la class User2
		usuario1.lastName = "Jamón"; //Esto sí va a funcionar pq el field lastName está definido como public en la class User2,
								  //cualquier Method puede acceder a él. Pero tb podemos usar el setter-Method de esta class para definir lastName.
//		usuario.setLastName("Jamón"); //setter-Method de la class User2
		
//		System.out.println(usuario.firstName + " " + user2.lastName); //Esto no va funcionar pq firstName está definido como "private" y no puedo
																	//acceder a su valor salvo con methods de la propia class User2 --> getter-Method
		System.out.println("Output del usuario1 usando setters and getters:");
		System.out.println(usuario1.getFirstName() + " " + usuario1.lastName); //getter-Method de la class User2 para el private field firstName
//		System.out.println(usuario.getFirstName() + " " + usuario.getLastName()); //getter-Method de la class User2 para private and public fields
		
		User2 usuario2 = new User2();
		usuario2.setFirstName("Carlos");
		usuario2.lastName = "Martínez";
		
		//Usando una lista llamada usuarios para guardar a todos los usuarios
		List<User2> usuarios = new ArrayList<User2>();
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		System.out.println("Output del usuario2 usando listas de objetos:");
		System.out.println(usuarios.get(1).getFullName());
		
		//vs Using instance Methods
		System.out.println("Output del usuario1 usando instance-Methods:");
		usuario1.printUser1();
		
		//vs Using static Methods	
		System.out.println("Output del usuario1 usando static-Methods:");
		User2.printUser2(usuario1);

		
		//vs Using statich Methods for a list of objects
		System.out.println("Output de los objetos de la class User2 usando static-Methods y listas:");
		User2.printUsers(usuarios);
		
	}

}

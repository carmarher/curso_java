//Este código define la class User con 4 fields y 4 Methods

import java.util.List;

public class User2 {
	//Creating fields of a class
	private String firstName;
	public String lastName;
	public int age;
	public String password;
	
	//Creating a setter-Method --> Nos servirá para asignar valores a "private" fields de una class
	public void setFirstName(String fn) {  //By convention they begin with a "set-"
		firstName = fn;
	}
	
	public void setLastName(String ln) {
		lastName = ln;
	}
	
	//Creating a getter-Method --> Nos servirá para obtener los valores de "private" fields de una class
	public String getFirstName() { //By convention they begin with a "get-"
		return firstName;
      //return firstName.toUpperCase();
	}
		
	public String getLastName() {
		return lastName;
	}
		
	//Creating a getter-Method para conseguir el nombre completo
	public String getFullName2() {
		return firstName + " " + lastName; //Como estamos dentro de la class User, podemos usar los field private
	}

	//Creating a getter-Method para conseguir el nombre completo	
	public String getFullName() {
		return getFirstName() + " " + getLastName(); //para ser más consistente podemos usar sólo getters and setters y no los fields directamente
	}
	
	//Instance Method --> Se usará invocando a un objeto de la class User2
	public void printUser1() {
		System.out.println(getFullName());
	}
	
	//Static Method --> Se usará invocando directanmente a la class User2
	public static void printUser2(User2 u) {
		System.out.println(u.getFullName());
	}
	
	//Static Method --> Se usará invocando directanmente a la class User2. En este caso a una lista entera de la class User2
	public static void printUsers(List<User2> users) {
		for(User2 u : users) {
			System.out.println(u.getFullName());
		}
	}
	
}

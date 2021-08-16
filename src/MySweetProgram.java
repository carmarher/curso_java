import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MySweetProgram {	//Class
		
	//Siempre se necesita a method main
	public static void main(String[] args) {	//Member: Method
		//Syntax for output
//		System.out.println("What is your name?");
		
		//Syntax for input
		//type identifier = new type();
//		Scanner scanner = new Scanner(System.in); //Creamos la variable scanner que es un objeto
//		String name = scanner.nextLine(); //No static, we have to create a new Scanner object

		//Declaro la variable primero:
//		String string;	
		//Inicializo la variable:
//		string = new String("This is a string");	//Creamos la variable String que es un objeto
		//Puedo hacer las dos cosas a la vez:
		//String string = new String("This is a string");
//		System.out.println(string + " :) "); //Expression concatinating strings
		
		//Easier way to create a String:
//		String easier = "Wow, that was easy!" + " :) " + string;
//		System.out.println(easier);
		
		//Ejemplos de methods de las class Double o Integer
//		System.out.println(Integer.SIZE);
//		System.out.println(Double.NaN);
//		System.out.println(Math.sqrt(-1));
//		System.out.println(Double.isNaN(Math.sqrt(-1)));
//		System.out.println(Integer.max(a, b));
//		System.out.println(Integer.compare(x, y));
		
		/*Convert a String into a Integer or a int:
		String money = "300";
		Integer a = Integer.valueOf(money);
		int b = Integer.parseInt(money);
		System.out.println(a);
		System.out.println(b);*/
		
		//Creating a class and Fields
//		User user = new User(); // Instanciando la class User
//		user.firstName = "Carlos";
//		user.lastName = "Martín";
		//Output directamente
		//System.out.println(user.firstName + " " + user.lastName);
		//Output mediante un método de la class User
		//user.output();	
		//Output mediante un método de la class User con argumentos
		//user.output1(4);	
		//Output mediante un método String de la class User
		//System.out.println(user.output2());
		//Input mediante un método de la class User
		//user.inputoutput();
		
		//Using getter and setter with class User2 --> firstName (private) and lastName (public)
		User2 user2 = new User2(); //Definiendo un object user2 de la class User2
//		user2.firstName = "Mikel"; //Esto no va a funcionar pq el field firstName está definido como private en la class User2, 
								   //y sólo los Methods de la class User2 pueden acceder a él --> Usaremos el setter-Method de esta class.
//		user2.setFirstName("Mikel"); //setter-Method de la class User2
		user2.lastName = "Jamón"; //Esto sí va a funcionar pq el field lastName está definido como public en la class User2,
								  //cualquier Method puede acceder a él. Pero tb podemos usar el setter-Method de esta class para definir lastName.
//		user2.setLastName("Jamón"); //setter-Method de la class User2
		
//		System.out.println(user2.firstName + " " + user2.lastName); //Esto no va funcionar pq firstName está definido como "private" y no puedo
																	//acceder a su valor salvo con methods de la propia class User2 --> getter-Method
		System.out.println(user2.getFirstName() + " " + user2.lastName); //getter-Method de la class User2 para el private field firstName
//		System.out.println(user2.getFirstName() + " " + user2.getLastName()); //getter-Method de la class User2 para private and public fields
	
		//Using static Methods		
//		User2.printUser(user2);	
		
		/*Custom Arrays
		User2 me = new User2();
		me.setFirstName("Carlos");
		me.setLastName("Martín");
		
		User2 you = new User2();
		you.setFirstName("Mikel");
		you.setLastName("Jaca");
		List<User2> users = new ArrayList<User2>();
		users.add(you);
		users.add(me);
		
//		System.out.println(users.get(1).getFullName());
		
		//Using static Methods
		User2.printUsers(users);*/
		
		//Using inheritance from User3 class to Student Class
		Student s = new Student();
		s.firstName = "Caleb";
		s.lastName = "Curry";
		s.major = "Stanley";
		//System.out.println(s.firstName);
		s.sayHello();
	}
}

//comment
//class - Contains everything - has members (methods, properties)
//methods - do something (println). Has statements
//arguments - What you pass to a method (part of the calling)
//parameter - Variables to store arguments (part of the definition)
//statements - Telling the computer something
//properties - store something

//access modifier (public) - Who can use it?
//static - No instance of class is needed
//object - Instance of a class

//variable - stores some value
//variable creation: 1. declare, 2. initialize
//expression - evaluates to a value
//operator - work on operands to produce a value. P.ej: +

//primitive types: int, short, float, boolean, byte
//object - instance of a class (class the data type) 

//statically typed = variables are given data types up front: Java
//dynamically typed = variables do not have types
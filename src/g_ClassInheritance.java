import java.util.ArrayList;
import java.util.List;

//Este programa crea objetos de la clase Student que es derivada de la class User3
public class g_ClassInheritance {
	
	public static void main(String[] args) {
		//Using inheritance from User3 class for creating an object of Student Class
		Student estudiante = new Student(); //Se imprime un mensaje porque lo hemos definido así en el default contructor
		estudiante.firstName = "Caleb"; //Field de User3
		estudiante.lastName = "Curry";	//Field de User3
		estudiante.major = "Stanley";	//Fiel de Student
		
		estudiante.sayHello();		
		
		//Puedo crear un objeto de la class User3:
		User3 usuario1 = new User3();
		
		//Pero no puedo crear un objeto de la abstract class User4:
		//User4 usuario2 = new User4(); --> Da error
		
		//Using inheritance from User4 class for creating an object of StudentUser4 Class
		StudentUser4 estudiante1 = new StudentUser4();
		estudiante1.firstName = "Monica";
		estudiante1.lastName = "Seles";
		estudiante1.sayHello(); 	//Method de la class User4
		estudiante1.sayGodbye(); 	//Method de la class StudentUser4
		
		//Using inheritance from User4 class for creating an object of StudentUser4 Class
		TeacherUser4 profesor1 = new TeacherUser4();
		profesor1.firstName = "Steffi";
		profesor1.lastName = "Graff";
		profesor1.sayHello(); 	//Method de la class User4
		profesor1.sayGodbye(); 	//Method de la class TeacherUser4
		
		//Polimorfismo: Las clases derivadas siguen siendo class User4 en el fondo y las podemos tratar como tales
		List<User4> usuarios = new ArrayList<User4> (); //No instancio User4, creo una lista de objetos tipo User4.
		usuarios.add(estudiante1); //Y la lleno de objetos de sus clases derivadas
		usuarios.add(profesor1);
		for (User4 u : usuarios) {
			u.sayHello(); //Cada objeto interpretará este method como el method que tiene guardado en su código
			u.sayGodbye();//El method sayHello es común para ambos, pero el method sayGodbye es diferente para cada clase derivada
		}
		
		//Usando Custom constructor:
		Student estudiante2 = new Student(); //Default constructor para crear un objeto Student
		Student estudiante3 = new Student("Martina", "Hingis"); //Custom constructor para crear un objeto Student
		System.out.println(estudiante2.firstName + " " + estudiante2.lastName); //No hemos asignado nada a firstName o lastName
		System.out.println(estudiante3.firstName + " " + estudiante3.lastName); //Hemos asignado valores a los fields first- y lastName con el Custom constructor
	}

}

//Este c�digo define una clase abstracta llamada User4. Eso implica que no se pueden crear objetos (instanciar) de esta clase
//sino s�lo de sus derivadas, como la class StudentUser4 o la class TeacherUser4.
//Esta t�cnica nos permite reunir todos los fields y methos comunes a las clases derivadas en una clase principal, que no podremos
//usar para crear objetos pero a cuyos fields y methos s� tendr�n acceso las clases derivadas.

public abstract class User4 {
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void sayHello() {
		System.out.println("Hi! My name is " + firstName + " " + lastName);
	}
	
	//Tambi�n podemos crear abstract methods:
	public abstract void sayGodbye();
	//En este caso el method no tiene c�digo (body) pero existe y obliga a que todas las clases derivadas
	//tengan que @Override este abstract method para que no de error el c�digo de las clases derivadas
}

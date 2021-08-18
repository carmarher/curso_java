//Este código define la class User3 con 3 fields y 1 Method

public class User3 {
	public String firstName;
	public String lastName;
	public boolean verified = false;
	
	public void sayHello() {
		System.out.println("Hi! My name is " + firstName + " " + lastName);
	}
	
	//Con la keyword final, nos aseguramos que un method no puede ser override por sus class derivadas
	public final void sayGoodbye() {
		System.out.println("Good bye" + firstName + " " + lastName);
	}
}

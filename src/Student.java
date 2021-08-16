
public class Student extends User3 {
	public boolean verified = true;
	public String major;
	
	//Default constructor: se contruye automáticamente
	//pero lo podemos modificar o crear otro constructor
	public Student() {
		
	}
	
	//Custom constructor: Si hacemos un custom constructor
	//el default contructor lo tendremos que poner específicamente.
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	@Override
	public void sayHello() {
		//Para realizar también el method original
		//super.sayHello();
		System.out.println("Hi, my major is " + major
				+ ". My name is " + firstName + " " + lastName);
	}
}

//Este código extiende la class User3 con una class Student derivada

public class Student extends User3 {
	public boolean verified = true;
	public String major;
	
	//Default constructor: se contruye automáticamente. No hace falta declararlo y lo invocaremos a la hora de instanciar una class
	//Es igual que un method pero sin "return" field en la declaración y aunque se construye automáticamente y no es necesario declararlo
	//(en principio, ver abajo) pero también podemos declararlo y ponerle código dentro que se ejecutará cuando instanciemos la class 
	public Student() {
		System.out.println("An student has been created");
	}
	
	//Custom constructor: Si hacemos un custom constructor
	//el default contructor lo tendremos que poner específicamente. <-- IMPORTANTE
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	//Override un method que ya existe en la class principal User3
	@Override
	public void sayHello() {
		//Para realizar también el method original y no el override method usaremos la keyword super.(method)
		//super.sayHello();
		System.out.println("Hi, my major is " + major
				+ ". My name is " + firstName + " " + lastName);
	}
}

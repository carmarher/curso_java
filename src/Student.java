//Este c�digo extiende la class User3 con una class Student derivada

public class Student extends User3 {
	public boolean verified = true;
	public String major;
	
	//Default constructor: se contruye autom�ticamente. No hace falta declararlo y lo invocaremos a la hora de instanciar una class
	//Es igual que un method pero sin "return" field en la declaraci�n y aunque se construye autom�ticamente y no es necesario declararlo
	//(en principio, ver abajo) pero tambi�n podemos declararlo y ponerle c�digo dentro que se ejecutar� cuando instanciemos la class 
	public Student() {
		System.out.println("An student has been created");
	}
	
	//Custom constructor: Si hacemos un custom constructor
	//el default contructor lo tendremos que poner espec�ficamente. <-- IMPORTANTE
	public Student(String fn, String ln) {
		firstName = fn;
		lastName = ln;
	}
	
	//Override un method que ya existe en la class principal User3
	@Override
	public void sayHello() {
		//Para realizar tambi�n el method original y no el override method usaremos la keyword super.(method)
		//super.sayHello();
		System.out.println("Hi, my major is " + major
				+ ". My name is " + firstName + " " + lastName);
	}
}

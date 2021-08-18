//Clase derivada de User4
public class StudentUser4 extends User4 {
	public String university;
	public int grade;
	
	//Al haber creado un abstract method en la class User4 estoy obligado a overriding it aquí
	@Override
	public void sayGodbye() {
		System.out.println("Goodbye! I'm an student");
	}
	
}

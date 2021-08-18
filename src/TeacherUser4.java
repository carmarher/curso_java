//Clase derivada de User4, con la keyword final no podremos extender esta class con otra derivada
public final class TeacherUser4 extends User4 {
	public String subject;
	public String department;
	
	//Al haber creado un abstract method en la class User4 estoy obligado a overriding it aquí
	@Override
	public void sayGodbye() {
		System.out.println("Goodbye! I'm a teacher");
	}
}
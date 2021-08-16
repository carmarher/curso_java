//Este programa trabaja con Object y Primitives y los Methods que admiten cada uno
public class d_VariablesArrays {

	public static void main(String[] args) {
		
		//Java is a statically typed language --> all data types (of objects and variables) up front (before compiling)
		//Las variables que usemos pueden ser primitives or objects
		//An Object is an instance of a class (como frase es una instancia de la class String)
		//Primitives (only 8): boolean, byte, char, short, int, long, float and double
		//Creating an object --> type name; name = new type(); or type name = new type(); --> Después asigno el valor
		//Creating a primitive --> type name; name = value; or type name = value
		
		int a = 5; //Declarando y asignando valores al primitive a
		int b = 6;
		
		//creating constants: final type name = value;
		final double PI = 3.14159;
		
		//Ejemplos de methods de las class Double o Integer
		System.out.println(Integer.SIZE); //Devuelve el tamaño (en bits) de la class Integer
		System.out.println(Double.NaN); //NaN --> Not a number
		System.out.println(Math.sqrt(-1));
		System.out.println(Double.isNaN(Math.sqrt(-1))); //Devuelve true or false si el valor entre paréntesis no es un número (NaN)
		System.out.println(Integer.max(a, b));
		System.out.println(Integer.compare(a, b));
		
		//Convert a String into a Integer or a int:
		String money = "300";
		Integer x = Integer.valueOf(money); //Integer es una class que actúa igual que el primitive int
		int y = Integer.parseInt(money);
		System.out.println(x);
		System.out.println(y);
		
		//Arrays
		int[] grades; //declarando una array
		grades = new int[10]; // inicializando una array con tamaño y llena de 0 
		System.out.println(grades[8]);

	}

}

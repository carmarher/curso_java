//Este programa trabaja con strings y las diferentes maneras de definirlas y trabajr con ellas

public class c_Strings {

	public static void main(String[] args) {

		//Declaro la variable primero: (en realidad, en Java, lo que hago es instanciar la class String y creo un objeto llamado frase)
		String frase;	
		//Inicializo la variable (el nuevo objeto):
		frase = new String("This is a string");	//Creamos la variable String que es un objeto de la class String
		//Puedo hacer las dos cosas a la vez en una sola línea:
		String frase2 = new String("This is a string too");
		System.out.println(frase + " :) "); //Expression concatenating strings
		
		//Easier way to create a String:
		String frase3 = "Wow, that was easy!" + " :) " + frase2; //La class String permite definir strings como si fueran variables directamente
		//El operador "+" en Strings nos permite concatenarlas
		System.out.println(frase3);
		
	}

}

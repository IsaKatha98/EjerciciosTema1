package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int num1;//Variable introducida por el usuario.
		int num2;//Variable introducida por el usuario.
		String resultado;//Nos dirá si ambos números son iguales.
	
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
								
		Scanner sc= new Scanner (System.in); 
								
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
								
		System.out.print("Introduzca un número y pulse Intro: ");
		num1= sc.nextInt();
		System.out.print("Introduzca otro número y pulse Intro: ");
		num2= sc.nextInt();
		
		/*Comparamos si los números introducidos por el usuario son iguales.*/
		
		resultado=num1==num2?"Sí":"No";
	
		//Mostramos el resultado por la consola.
		
		System.out.print("¿Ambos números son iguales? "+resultado);
								
		//Por último, cerramos el escáner
								
		sc.close();
	}

}

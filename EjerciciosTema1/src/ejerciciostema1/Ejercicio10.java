package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {
	
	/*La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una 
	 * competición donde cada participante escribe un algoritmo en un papel y lo lanza, 
	 * ganando quien consiga lanzarlo más lejos. La peculiaridad del concurso es que la 
	 * longitud del lanzamiento se mide en metros (con tantos decimales como se desee), 
	 * pero para el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). 
	 * Por ejemplo, para un lanzamiento de 12,3456 m, que son 1234,56 cm solo se contabilizan 
	 * 1234 cm.Realiza un programa que solicite la longitud (en metros) de un lanzamiento y 
	 * muestre la parte entera correspondiente en centímetros. Utiliza la conversión de tipos.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		double a;//Será la variable que introduzca el usuario, en m.
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola */
										
		Scanner sc= new Scanner (System.in); 
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Introduzca su longitud de lanzamiento en metros y pulse Intro: ");
		a= sc.nextDouble();
		
		//Pasamos los metros a cm.
				
		a*=100;
				
		//Mostramos el resultado por la consola.
				
		System.out.print("La longitud de lanzamiento registrado es de "+ (int) a+" cm.");
										
		//Por último, cerramos el escáner.
										
		sc.close();

	}

}

package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
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
										
		//Por último, cerramos el escáner
										
		sc.close();

	}

}

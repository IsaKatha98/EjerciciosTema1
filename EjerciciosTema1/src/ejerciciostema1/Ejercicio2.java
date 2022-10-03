package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {
	
	/* Escribe un programa que tome como entrada un número entero e indique qué 
	 * cantidad hay que sumarle para que sea múltiplo de 7. Por ejemplo, a 2 hay 
	 * que sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que sumarle 1. 
	 * Usa el operador módulo (%) para calcularlo.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num;//Será la variable que introduzca el usuario.
		int resto;// Será la variable resultante del módulo de 7. 
		int suma; //Será la variable resultante de restar 7 - resto.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
		
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número y pulse Intro: ");
		num= sc.nextInt();
		
		/*Primero, averiguamos el resto de la división entre 7 (variable resto) del número 
		 * introducido por el usuario. A continuación, esta variable se la restamos a 7, 
		 * y nos dará la variable suma.*/
		
		resto=num%7;
		suma=7-resto;
		
		/*Mostramos el resultado por la consola. Ojo, mostramos la variable suma porque nos interesa 
		 * saber el número que deberíamos sumarle al número introducido por el usuario (num)
		 *  para que sea múltiplo de 7.*/
		
		System.out.print("Para que el número introducido sea múltiplo de 7, deberá sumarle: "+suma);
		
		//Por último, cerramos el escáner.
		
		sc.close();
		

	}

}

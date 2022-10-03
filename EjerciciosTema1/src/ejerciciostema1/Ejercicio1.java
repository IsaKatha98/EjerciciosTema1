package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio1 {
	
	/*Realizar un programa que pida como entrada un número con decimales y 
	 * lo muestre redondeado al entero más próximo. (SIN UTILIZAR Math.round()) */

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		double num; //Variable introducida por el usuario.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
		
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable.
		
		System.out.print("Introduzca un número con decimales y pulse Intro: ");
		num=sc.nextDouble();
		
		//Para redondear le sumamos a la variable 0,5 siempre .
		
		num+= 0.5;
		
		/*Mostramos el resultado en la consola. Ojo, haremos un casteo (int) en la variable
		para que solo muestre la parte entera.*/
		
		System.out.print("El número resultante es: "+ (int)num);
		
		//Cerramos el escáner.
		sc.close();
		
	}

}

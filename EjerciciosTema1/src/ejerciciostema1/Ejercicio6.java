package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int num;//Será la variable que introduzca el usuario, en segundos.
		int seg;//La variable segundos
		int min;//La variable minutos
		int horas;//La variable horas
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola */
								
		Scanner sc= new Scanner (System.in); 
								
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
								
		System.out.print("Introduzca un número en segundos y pulse Intro: ");
		num= sc.nextInt();
		
		/*Realizamos una primera división del número introducido por el usuario (num)
		 * entre 60 para hallar los minutos; y un módulo de 60 (%60) cuyo resultado aportará
		 * los segundos.*/
		
		seg=num%60;//Lo mostraremos en el resultado de segundos
		min=num/60;//Pasará a la siguiente operación
		
		//Volvemos a hacer lo mismo pero con la variable min para hallar las horas y minutos restantes.
		
		horas=min/60;
		min%=60;
		
		//Mostramos el resultado por la consola.
		
		System.out.print("El resultado es: "+horas+ " horas, "+min+" minutos y "+seg+" segundos.");
								
		//Por último, cerramos el escáner
								
		sc.close();


	}

}

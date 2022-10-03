package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio4 {
	
	/*Crea un programa que pida la base y la altura de un triángulo 
	 * y muestre su área. (AT = base*altura/2).*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		float base;//Será la variable que introduzca el usuario y que será la base del triángulo.
		float altura; //Otra variable introducida por el usuario y que será la altura del triángulo.
		float area; //El área del triángulo y el resultado que mostraremos por consola.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
						
		Scanner sc= new Scanner (System.in); 
						
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
						
		System.out.print("Introduzca la longitud de la base del triángulo y pulse Intro: ");
		base= sc.nextFloat();
		System.out.print("Introduzca la longitud de la altura del triángulo y pulse Intro: ");
		altura=sc.nextFloat();
						
		/*Hacemos el cálculo del área del triángulo.*/
						
		area=base*altura/2;
		
		//Mostramos el resultado por la consola. 
						
		System.out.print("El área del triángulo es de: "+area+ " um.");
						
		//Por último, cerramos el escáner.
						
		sc.close();

	}

}

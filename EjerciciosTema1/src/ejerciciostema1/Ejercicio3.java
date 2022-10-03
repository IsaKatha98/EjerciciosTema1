package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio3 {
	
	/*Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, 
	 * num1 y num2, diga qué cantidad hay que sumarle a num1 para que sea múltiplo de num2.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int num1;//Será la variable que introduzca el usuario.
		int num2; //Otra variable introducida por el usuario.
		int resto;// Será la variable resultante del módulo de num2.
		int suma; //Será la variable resultante de restar num2-resto.
			
				
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
				
		Scanner sc= new Scanner (System.in); 
				
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		 * variable correspondiente.*/
				
		System.out.print("Introduzca un número (num1) y pulse Intro: ");
		num1= sc.nextInt();
		System.out.print("Introduzca otro número (num2) y pulse Intro: ");
		num2=sc.nextInt();
				
		/*Primero, averiguamos el resto de la división entre num2 entre num1.
		 * A continuación, la variable resultante (resto) se la restamos a num2 , 
		 * y nos dará la variable suma.*/
				
		resto=num1%num2;
		suma=num2-resto;
				
		/*Mostramos el resultado por la consola. Ojo, mostramos la variable suma porque nos 
		 * interesa saber el número que deberíamos sumarle a num1 para que sea múltiplo de num2.*/
				
		System.out.print("Para que num1 sea múltiplo de num2, deberá sumarle: "+suma);
				
		//Por último, cerramos el escáner.
				
		sc.close();

	}

}

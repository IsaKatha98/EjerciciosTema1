package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio7 {
	
	/*Solicita al usuario tres distancias:la primera, medida en milímetros.La segunda, 
	 * medida en centímetros.La última, medida en metros.Diseña un programa que muestre 
	 * la suma de las tres longitudes introducidas (medida en centímetros).*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		float a;//Será la variable que introduzca el usuario, en mm.
		float b;//Será la variable que introduzca el usuario, en cm.
		float c;//Será la variable que introduzca el usuario, en m.
		float resultado;//La variable resultado, en cm.
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
								
		Scanner sc= new Scanner (System.in); 
								
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
								
		System.out.print("Introduzca un número en milímetros y pulse Intro: ");
		a= sc.nextFloat();
		System.out.print("Introduzca un número en centímetros y pulse Intro: ");
		b= sc.nextFloat();
		System.out.print("Introduzca un número en metros y pulse Intro: ");
		c= sc.nextFloat();
		
		//Primero debemos pasar los milímetros y metros a cm.
		
		a/=10;
		c*=100;
		
		//A continuación, sumaremos todas las medidas en cm.
		
		resultado=a+b+c; 
		
		//Mostramos el resultado por la consola.
		
		System.out.print("La suma de las tres medidas introducidas es: "+resultado+" cm.");
								
		//Por último, cerramos el escáner.
								
		sc.close();

	}

}

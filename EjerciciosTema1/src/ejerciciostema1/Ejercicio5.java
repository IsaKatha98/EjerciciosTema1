package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio5 {
	
	/*Dado el siguiente polinomio de segundo grado:y=ax^2+bx+c
	Crea un programa que pida los coeficientes a, b y c, así como el valor de x, 
	y calcula el valor correspondiente de y.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		int x;//Será la variable x.
		int a;//Será la incógnita referente a "a". 
		int b;//Será la incógnita referente a "b".
		int c;//Será la incógnita referente a "c".
		int resultado; //Será la variable y.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
						
		Scanner sc= new Scanner (System.in); 
						
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
						
		System.out.print("Dado el siguiente polinomio: y=ax^2+bx+c; introduzca el valor de x: ");
		x=sc.nextInt();
		System.out.print("Introduzca el valor de a y pulse Intro: ");
		a= sc.nextInt();
		System.out.print("Introduzca el valor de b y pulse Intro: ");
		b=sc.nextInt();
		System.out.print("Introduzca el valor de c y pulse Intro: ");
		c=sc.nextInt();
						
		//Realizamos la operación.
						
		resultado= a*(x*x)+b*x+c;
						
		//Mostramos el resultado por la consola.
						
		System.out.print("El resultado del polinomio, según los valores indicados, es: "+resultado);
						
		//Por último, cerramos el escáner.
						
		sc.close();

	}

}

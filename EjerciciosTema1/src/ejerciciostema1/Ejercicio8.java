package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
		float p_niños;//Variable introducida por el usuario, cantidad de niños.
		float p_adultos;//Variable introducida por el usuario, cantidad de adultos.
		float p_suma;//Precio total sin aplicar el descuento.
		float resultado;//Precio resultado con deccuento aplicado.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola. */
										
		Scanner sc= new Scanner (System.in); 
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Indique la cantidad de niños y pulse Intro: ");
		p_niños= sc.nextFloat();
		System.out.print("Indique la cantidad de adultos y pulse Intro: ");
		p_adultos= sc.nextFloat();
				
		/*Calculamos el precio total de las entradas. Primero, multiplicamos el precio de las entradas 
		 * correspondiente por los niños y adultos indicados por el usuario. Después, se suman las cantidades.*/
				
		p_niños*=15.50;
		p_adultos*=20;
		p_suma=p_niños+p_adultos;
		
		/*A continuación, debemos identificar si se aplica el descuento. Para ello; */
		
		resultado=p_suma>=100?1:0;
			
		//Mostramos el resultado por la consola.
				
		System.out.print(resultado);
										
		//Por último, cerramos el escáner
										
		sc.close();

	}

}

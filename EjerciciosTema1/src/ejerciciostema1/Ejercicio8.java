package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio8 {
	
	/*Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude 
	 * a calcular el importe que hay que cobrar en la taquilla por la compra de una serie de
	 *  entradas (cuyo número será introducido por el usuario). Existen dos tipos de entradas:
	 *  infantiles, que cuestan 15,50€; y de adultos, que cuestan 20€. En el caso de que el 
	 *  importe total sea igual o superior a 100€, se aplicará automáticamente un bono 
	 *  descuento del 5%.*/

	public static void main(String[] args) {
		
		//Declaramos las variables.
		
		double precioNiños;//Variable introducida por el usuario, cantidad de niños.
		double precioAdultos;//Variable introducida por el usuario, cantidad de adultos.
		double precioSuma;//Variable resultado.
		final double DESCUENTO=0.05;//Descuento del 5%.
					
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola.*/
										
		Scanner sc= new Scanner (System.in); 
										
		/*Le pediremos al usuario que introduzca los datos y los guardaremos en la 
		* variable correspondiente.*/
										
		System.out.print("Indique la cantidad de niños y pulse Intro: ");
		precioNiños= sc.nextFloat();
		System.out.print("Indique la cantidad de adultos y pulse Intro: ");
		precioAdultos= sc.nextFloat();
				
		/*Calculamos el precio total de las entradas. Primero, multiplicamos el precio de las entradas 
		 * correspondiente por los niños y adultos indicados por el usuario. 
		 * Después, se suman las cantidades.*/
				
		precioNiños*=15.50;
		precioAdultos*=20;
		precioSuma=precioNiños+precioAdultos;
		
		/*A continuación, debemos identificar si se aplica el descuento. Para ello; 
		 * se hace una condicional. En el caso de que la suma total de las entradas sea
		 * mayor o igual que 100, se aplicará el 5% de descuento. En el caso contrario,
		 * no se aplicará descuento y se mostrará el precio directamente. */
		
		precioSuma=precioSuma>=100?precioSuma-(precioSuma*DESCUENTO):precioSuma;
		
		//Mostramos el resultado por la consola.
				
		System.out.print("El precio total que deberá pagar es: " +precioSuma+ " €.");
										
		//Por último, cerramos el escáner
										
		sc.close();

	}

}

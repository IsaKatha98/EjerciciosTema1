package ejerciciostema1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//Declaramos las variables
		
		int num;//Será la variable que introduzca el usuario
		int resto;// Será la variable resto del módulo de 7 
		int num2; //Será
		int resultado;//Será la variable que devuelva el resultado
		
		/*Creamos un escáner para poder leer los datos que introduzca el usuario por
		la consola */
		
		Scanner sc= new Scanner (System.in); 
		
		//Le pediremos al usuario que introduzca los datos y los guardaremos en la variable
		
		System.out.print("Introduzca un númeroy pulse Intro: ");
		num= sc.nextInt();
		
		//Primero, averiguamos el resto de la división entre 7. El número que querremos sumar 
		
		resto=num%7;
		suma=7-resto;
		num2=suma+num;
		
		System.out.print(suma);
		//Después, 

	}

}

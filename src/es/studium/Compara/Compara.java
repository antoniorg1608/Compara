package es.studium.Compara;

import java.util.Scanner;

public class Compara {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero1,numero2;
		System.out.println("Dame un numero");
		numero1 = teclado.nextInt();
		System.out.println("Dame otro numero");
		numero2 = teclado.nextInt();
		teclado.close();
		if(numero1==numero2)
		{
			System.out.println("Los numeros son iguales");
		}
		else
		{
			if(numero1>numero2)
			{
			System.out.println("El numero1 es mayor que el numero2");
		    }
			else
			{
				System.out.println("El numero2 es mayor que el numero1");
			}

	    }
	}
}


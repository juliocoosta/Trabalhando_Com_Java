package Primerio_Exemplo;

import java.util.Scanner;

public class Programa1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x, circuferencia, volume;
		double PI = 3.14;
		
		System.out.println("Informe o valor:");
		x = sc.nextDouble();
		
		circuferencia = 2 * PI * x;
		
		volume = 4 * PI * Math.pow(x, 3)/3;
		
		System.out.println("Valor da Circuferência: " + circuferencia);
		System.out.println("Valor do Volume: " + volume);
		System.out.println("Valor do PI: "+ PI);
		
		
		
		
		sc.close();

	}

}

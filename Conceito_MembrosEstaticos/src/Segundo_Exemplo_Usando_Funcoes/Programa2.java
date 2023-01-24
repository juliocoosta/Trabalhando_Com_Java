package Segundo_Exemplo_Usando_Funcoes;

import java.util.Locale;
import java.util.Scanner;

public class Programa2 {
	
	public static final double PI = 3.14;


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor:");
		double x = sc.nextDouble();
		
		double c = circuferencia(x);
		
		double v = volume(x);
		
		System.out.println("Valor da Circuferência: " + c);
		System.out.println("Valor do Volume: " + v);
		System.out.println("Valor do PI: "+ PI);
		
		
	sc.close();

	}

	public static double circuferencia(double x) {
		return  2 * PI * x;
	}
	public static double volume(double x) {
		return  4 * PI * Math.pow(x, 3)/3;
	}
}

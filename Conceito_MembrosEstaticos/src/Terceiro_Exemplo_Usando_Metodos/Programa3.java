package Terceiro_Exemplo_Usando_Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Programa3 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		Metodos m = new Metodos();
		
		System.out.println("Informe o valor:");
		double x = sc.nextDouble();
		
		double c = circuferencia(x);
		
		double v = volume(x);
		
		System.out.println("Valor da Circuferência: " + c);
		System.out.println("Valor do Volume: " + v);
		System.out.println("Valor do PI: "+ PI);
		
		
	sc.close();

  }

}



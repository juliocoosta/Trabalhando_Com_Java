package Quarto_Exemplo_Usando_Metodos_Estaticos;

import java.util.Locale;
import java.util.Scanner;

import Metodos_Estaticos_Para_Quarto_Exemplo.Metodos_Estaticos_Programa4;



public class Programa4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o valor:");
		double raio = sc.nextDouble();
		
		double c = Metodos_Estaticos_Programa4.circuferencia(raio);
		
		double v = Metodos_Estaticos_Programa4.volume(raio);
		
		System.out.println("Valor da Circuferência: " + c);
		System.out.println("Valor do Volume: " + v);
		System.out.println("Valor do PI: "+ Metodos_Estaticos_Programa4.PI);
		
		
	sc.close();

	}

}

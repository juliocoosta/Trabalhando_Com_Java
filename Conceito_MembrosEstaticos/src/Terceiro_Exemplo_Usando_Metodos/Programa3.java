package Terceiro_Exemplo_Usando_Metodos;

import java.util.Locale;
import java.util.Scanner;

import Metodos_Para_Terceiro_Exemplo.Metodos;

public class Programa3 {

	public static void main(String[] args) {
		
		Metodos m = new Metodos();
		
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o valor:");
		double raio = sc.nextDouble();
		
		double c = m.circuferencia(raio);
		
		double v =m.volume(raio);
		
		System.out.println("Valor da CircuferĂȘncia: " + c);
		System.out.println("Valor do Volume: " + v);
		System.out.println("Valor do PI: "+ m.PI);
		
		
	sc.close();

  }

}



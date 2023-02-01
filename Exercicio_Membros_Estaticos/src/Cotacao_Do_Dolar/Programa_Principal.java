package Cotacao_Do_Dolar;

import java.util.Scanner;

import Metodos.Metodos_Utilitario;

public class Programa_Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Contação do Dolar:");
		System.out.println("Atual valor do dólar está: " + Metodos_Utilitario.DOLAR);
		System.out.println("Considerando que terá que pagar 6% de IOF sobre o valor do dólar.");
		System.out.print("informe a quantidade de dólar que você quer comprar: ");
		double x = sc.nextDouble();
		
		System.out.println("Quantidade a pagar: " + Metodos_Utilitario.resultado(x));
		
		
		
		sc.close();
	}

}

import java.util.Scanner;

public class PostoDeGasolina {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int alcool, gasolina,diesel;
		
		System.out.println("Posto de Combustível Mags.");
		System.out.println("---------------------------");
		
		System.out.println("Informe seu nome:");
		String nome = sc.next();
		System.out.println("Olá," + nome + ":");
		System.out.println("---------------------------");
		
		System.out.println("Qual das opções abaixo você mais usa no nosso posto ?");
		System.out.println("1 - Álccol");
		System.out.println("2 - Gasolina");
		System.out.println("3 - Diesel");
		System.out.println("4 - Sair");
		int res = sc.nextInt();
		
		alcool = 0;
		gasolina = 0;
		diesel = 0;
		
		if (res == 1) {
			
			alcool = alcool + 1;
		}
		else if (res == 2) {
			
			gasolina = gasolina + 1;
		}
		else if (res == 3) {
			
			diesel = diesel + 1;
		}
		else if (res == 4) {
			System.out.println("Muito Obrigado!");
			System.out.println("Álcool: " + alcool);
			System.out.println("Gasolina:" + gasolina);
			System.out.println("Diesel:" + diesel);
		}
		
		while(res != 4) {
			System.out.println("Qual das opções abaixo você mais usa no nosso posto ?");
			System.out.println("1 - Álccol");
			System.out.println("2 - Gasolina");
			System.out.println("3 - Diesel");
			System.out.println("4 - Sair");
			res = sc.nextInt();
			
		
		if (res == 1) {
			
			alcool = alcool + 1;
		}
		else if (res == 2) {
			
			gasolina = gasolina + 1;
		}
		else if (res == 3) {
			
			diesel = diesel + 1;
		}
		else if (res == 4) {
			System.out.println("Muito Obrigado!");
			System.out.println("Álcool: " + alcool);
			System.out.println("Gasolina: " + gasolina);
			System.out.println("Diesel: " + diesel);
		}
		
	 }
		
   }
	
}


import java.util.Scanner;

public class NegativoOuNao {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		double valor;
		
		System.out.println("Programa para mostrar se o número digitado é negativo ou positivo");
		System.out.println("-----------------------------------------------------------------");
		System.out.print("Digite um valor:");
		valor = sc.nextDouble();
		
		if(valor >= 0) {
			System.out.printf("Numero Positivo.");
		}
		else {
			System.out.printf("Numero Negativo.");
		}
		sc.close();	
	}
}

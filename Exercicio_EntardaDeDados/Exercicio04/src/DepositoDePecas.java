
import java.util.Locale;
import java.util.Scanner;

public class DepositoDePecas {

	public static void main(String[] args) {
		
		System.out.println("Deposito Dos Mags");
		System.out.println("-----------------");
		
		
		
				Locale.setDefault(Locale.US);
				Scanner sc = new Scanner(System.in);
				
				String produto1, produto2;
				int cod1, qte1;
			    double preco1, total;
			    
			    System.out.println("Informe o nome do produto:");
			    produto1 = sc.nextLine();
			    System.out.println("Informe a quantidade do produto:");
			    qte1 = sc.nextInt();
			    System.out.println("Informe o valor do produto:");
			    preco1 = sc.nextDouble();
			    
			 
			    total = preco1 * qte1;

			    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
				
				sc.close();
			
		
	}

}

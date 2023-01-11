import java.util.Scanner;

public class LanchoneteDosMags {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Lanchonete Dos Mags");
		System.out.println("---------------------");
		
		int pedido,quantidade;
		double preco;
		
		
		System.out.println("1 - Cachorro-Quente: R$ 4,00.");   
		System.out.println("2 - X-Salada: R$ 4,50.");  
		System.out.println("3 - X-Bacon: R$ 5,00.");  
		System.out.println("4 - Torrada Simples: R$ 2,00.");  
		System.out.println("5 - Refrigerante: R$ 1,50.");  
		
		System.out.println("------------------------------");
		System.out.println("Informe seu pedido:");
		pedido = sc.nextInt();
		
		System.out.println("Informa a quantidade:");
		quantidade =sc.nextInt();
		
		
		
		if (pedido == 1) {
			
			preco = quantidade * 4;
			System.out.printf("Pedido: Cachorro-Quente.\n");
			System.out.printf("Quantidade: %d\n", quantidade);
			System.out.printf("Valor a pagar: %.2f:\n", preco);
		}
		else if (pedido == 2) {
			preco = quantidade * 4.50;
			System.out.printf("Pedido: X-Salada.\n");
			System.out.printf("Quantidade: %d\n", quantidade);
			System.out.printf("Valor a pagar: %.2f:\n", preco);
		}
		else if (pedido == 3) {
			preco = quantidade * 5;
			System.out.printf("Pedido: X-Bacon.\n");
			System.out.printf("Quantidade: %d\n", quantidade);
			System.out.printf("Valor a pagar: %.2f:\n", preco);
		}
		else if (pedido == 4) {
			preco = quantidade * 2;
			System.out.printf("Pedido: Torrada Simples.\n");
			System.out.printf("Quantidade: %d\n", quantidade);
			System.out.printf("Valor a pagar: %.2f:\n", preco);
		}
		else if (pedido == 5) {
			preco = quantidade * 1.5;
			System.out.printf("Pedido: Refrigerante.\n");
			System.out.printf("Quantidade: %d\n", quantidade);
			System.out.printf("Valor a pagar: %.2f:\n", preco);
			
		}
    }
}

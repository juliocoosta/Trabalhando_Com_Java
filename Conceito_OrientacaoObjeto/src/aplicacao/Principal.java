package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Insera os dados do produto");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		
		System.out.print("Preco: ");
		produto.preco = sc.nextDouble();
		
		System.out.print("Quantidade: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println();
		System.out.println("Produto Data: " + produto);
		
		System.out.println();
		System.out.println("Entre com o a quantidade de produto para ser adicionado no estoque:");
		int quantidade = sc.nextInt();
		produto.addProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: " + produto);
		
		
		System.out.println();
		System.out.println("Entre com o a quantidade de produto para ser removido no estoque:");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println();
		System.out.println("Atualizado: " + produto);
		
		
		sc.close();

	}

}

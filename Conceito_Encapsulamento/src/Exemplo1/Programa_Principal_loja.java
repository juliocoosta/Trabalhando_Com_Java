package Exemplo1;

import java.util.Scanner;

public class Programa_Principal_loja {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insera os dados do produto");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Preco: ");
		double preco = sc.nextDouble();

		
		Metodo_Para_loja_Encapsulamento M = new Metodo_Para_loja_Encapsulamento(nome, preco);
		
	
		
		System.out.println();
		System.out.println("Produto Data: " + M);

		System.out.println();
		System.out.println("Entre com o a quantidade de produto para ser adicionado no estoque:");
		int quantidade = sc.nextInt();
		M.addProduto(quantidade);

		System.out.println();
		System.out.println("Atualizado: " + M);

		System.out.println();
		System.out.println("Entre com o a quantidade de produto para ser removido no estoque:");
		quantidade = sc.nextInt();
		M.removerProduto(quantidade);

		System.out.println();
		System.out.println("Atualizado: " + M);

		sc.close();

	}

}


import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma //
		// mensagem explicativa, conforme exemplos.//
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double n1,n2,soma;
		
		System.out.print("Olá, como você se chama?\n");
		nome = sc.nextLine();
		
		System.out.print("Olá, " + nome + " digite o primeiro valor:");
		n1 = sc.nextDouble();
		
		System.out.print("digite o segundo valor:");
		n2 = sc.nextDouble();
		
		soma = n1 + n2;
		
		System.out.printf("A soma entre os números digitados foi:%.2f",soma);
		

	}

}

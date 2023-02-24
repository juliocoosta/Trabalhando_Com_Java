package Banco_Mags;

import java.util.Locale;
import java.util.Scanner;

public class Cadastro_Bancario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Dados_Do_Cliente c = new Dados_Do_Cliente();
		
		System.out.println("BANCO CENTRAL MAGS");
		System.out.print("Digite o número da conta: ");
		c.setNumero(sc.nextInt());
		
		
		System.out.print("Informa o nome completo do titular: ");
		c.setNome(sc.next());
		
		System.out.print("Deseja depositar algum valor inicial (s/n) ? ");
		char x = sc.next().charAt(0);
		
		if (x == 's') {
			System.out.println("Informe o valor a depositar: ");
			c.setValor(sc.nextDouble());
			System.out.println("-------------------------------");
			System.out.println("Cadastro Bancário Criado com Sucesso:");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.getValor() + ".");
		}
		else if (x == 'n') {
			
			System.out.println("Cadastro Bancário Criado com Sucesso:");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.getValor() + ".");
			System.out.println("Deseja despositar algum valor agora (s/n) ? ");
			x = sc.next().charAt(0);
			
		}
	
		if (x == 's') {
			
			
			System.out.println("-------------------------------");
			System.out.println("Conta Atualizada:");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.addDeposito(x) + ".");
		}
		else {
			System.out.println("-------------------------------");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.addDeposito(x) + ".");
		}
		
		System.out.println("Deseja sacar algum valor (s/n) ? ");
		x = sc.next().charAt(0);
		
		if (x == 's') {
			
			System.out.println("Informe o valor desejado para saque:");
			c.setSacar(sc.nextDouble());
			System.out.println("-------------------------------");
			System.out.println("Conta Atualizada:");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.removerDeposito(x) + ".");
		}
		else {
			System.out.println("-------------------------------");
			System.out.print("Conta: "+ c.getNumero() + ", ");
			System.out.print("Titular: "+ c.getNome() + ", ");
			System.out.println("Saldo: R$ "+ c.addDeposito(x) + ".");
		}
			
			
		sc.close();
		
		

	}  

}

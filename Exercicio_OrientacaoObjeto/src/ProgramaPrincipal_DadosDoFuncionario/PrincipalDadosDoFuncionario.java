package ProgramaPrincipal_DadosDoFuncionario;

import java.util.Scanner;

import SubPrograma_DadosDoFuncionario.SubProgrmaDadosDoFuncionario;

public class PrincipalDadosDoFuncionario {

	public static void main(String[] args) {
		
		SubProgrmaDadosDoFuncionario funcionario = new SubProgrmaDadosDoFuncionario();
		
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Informe o nome do funcionário: ");
		funcionario.nome = sc.nextLine();
		
		System.out.print("Informe o salário bruto: ");
		funcionario.salariobruto = sc.nextDouble();
		
		System.out.print("Informe o valor do imposto: ");
		funcionario.imposto = sc.nextDouble();
		
		
		System.out.println("Dados do funcionário: " + funcionario.nome + ", $ " + funcionario.salarioliquido());
		
		System.out.println("Informe sua porcentagem de aumento salarial esse ano: ");
		funcionario.porcentagem = sc.nextDouble();
		
		
		System.out.println(funcionario);
		
		 sc.close();

	}

}

package ProgramaPrincipal_NotasDosAlunos;

import java.util.Scanner;

import SubPrograma_NotasDosAlunos.DadosDoAluno;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		DadosDoAluno aluno = new DadosDoAluno();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Escola Mags");
		System.out.println("------------");
		
		System.out.println("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Primeira Nota: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Segunda Nota: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Terceira Nota: ");
		aluno.nota3 = sc.nextDouble();
		
		
		sc.close();
	}

}

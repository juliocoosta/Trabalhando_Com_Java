package ProgramaPrincipal_NotasDosAlunos;

import java.util.Scanner;

import SubPrograma_NotasDosAlunos.DadosDoAluno;

public class MenuPrincipal {

	public static void main(String[] args) {
		
		DadosDoAluno aluno = new DadosDoAluno();
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Escola Mags");
		System.out.println("------------");
		
		System.out.print("Nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Primeira Nota: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Segunda Nota: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Terceira Nota: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Soma das notas do aluno: " + aluno.nome + " = " + aluno.soma());
		
		if (aluno.soma() < 60) {
			System.out.println("Reprovado");
			System.out.println("Ficaram faltando exatamente " + aluno.somaToltal() + " pontos no mínimo para o aluno ser aprovado");
		} else {
			System.out.println("Aprovado");
		}
		
		sc.close();
	}

}

 package SubPrograma_NotasDosAlunos;

public class DadosDoAluno {
	
	public String nome;
	public double nota1,nota2,nota3;
	public double media,soma;
	
	public double soma() {
		return nota1 + nota2 + nota3;
		
	}
	
	public double somaToltal() {
		if (soma() < 60) {
			return 60 - soma();
		}
		else {
			return 0;
		}
	}
}
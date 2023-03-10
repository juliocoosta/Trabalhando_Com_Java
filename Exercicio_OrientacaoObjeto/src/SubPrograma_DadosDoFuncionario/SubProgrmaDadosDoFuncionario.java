package SubPrograma_DadosDoFuncionario;

public class SubProgrmaDadosDoFuncionario {
	
	public String nome;
	public double salariobruto;
	public double imposto;
	public double porcentagem;
	
	
	public double salarioliquido() {
		return salariobruto - imposto;
	}
	
	public double porcentagem() {
		return ((salariobruto * porcentagem)/100) + salarioliquido();
	}
	
	public String toString() {
		return
				"Dados do funcionário atualizado: "
				+ nome
				+ ", $ "
				+ String.format("%.2f",porcentagem());
	}
}
 
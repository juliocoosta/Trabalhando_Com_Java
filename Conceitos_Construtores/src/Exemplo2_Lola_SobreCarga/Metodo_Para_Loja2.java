package Exemplo2_Lola_SobreCarga;

public class Metodo_Para_Loja2 {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Metodo_Para_Loja2 (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	public Metodo_Para_Loja2 (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}

	public void addProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	public String toString() {
		return nome +
				", $ " + String.format("%.2f", preco) + 
				", " + quantidade + 
				" unidades, Total: $ "
				+ String.format("%.2f", totalValorEmEstoque());
	}
}


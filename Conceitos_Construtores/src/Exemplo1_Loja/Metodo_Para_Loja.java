package Exemplo1_Loja;

public class Metodo_Para_Loja {

	public String nome;
	public double preco;
	public int quantidade;
	
	public Metodo_Para_Loja (String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
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


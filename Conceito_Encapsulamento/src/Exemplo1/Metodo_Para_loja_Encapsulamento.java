package Exemplo1;

public class Metodo_Para_loja_Encapsulamento {
	
	private String nome;
	private double preco;
	private int quantidade;
	
	public Metodo_Para_loja_Encapsulamento (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
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



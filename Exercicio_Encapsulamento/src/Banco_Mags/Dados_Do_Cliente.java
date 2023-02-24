package Banco_Mags;

public class Dados_Do_Cliente {
	
	private int numero;
	private String nome;
	private double valor;
	private double deposito;
	private double sacar;
	
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

	public double getSacar() {
		return sacar;
	}

	public void setSacar(double sacar) {
		this.sacar = sacar;
	}

	public double addDeposito(double deposito ) {
		return this.valor + this.deposito;
	}
	
	public double removerDeposito (double deposito) {
		return this.addDeposito(deposito) - this.sacar;
	}
	
}

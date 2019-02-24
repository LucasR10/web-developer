package br.com.webdeveloper.tags;

public class Salario {

	private double  valor;
	private long desconto;
	
	public Salario(double valor, long desconto) {
		this.valor = valor;
		this.desconto = desconto;
	}

	public Salario() {
	}
	
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public long getDesconto() {
		return desconto;
	}

	public void setDesconto(long desconto) {
		this.desconto = desconto;
	}
	
	
	
}

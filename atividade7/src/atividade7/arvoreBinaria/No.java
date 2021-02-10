package atividade7.arvoreBinaria;

public class No {
	
	// valor a ser inserido
	private int valor;
	
	// apontadores
	private No esquerda;
	private No direita;
	
	// Inicializar nó - recebe um valor
	public No(int valor) {
		this.valor = valor;
		direita = null;
		esquerda = null;
	}
	
	public int getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	@Override
	public String toString() {
		return "No [valor=" + valor + "]";
	}
	
	
	
}

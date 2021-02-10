package arvoreBinaria;

public class No {
	
	// valor a ser inserido
	private Integer valor;
	
	// apontadores
	private No esquerda;
	private No direita;
	
	// Inicializar nó - recebe um valor
	public No(Integer valor) {
		this.valor = valor;
		direita = null;
		esquerda = null;
	}
	
	//Inicializar nó, se você já possui esquerda e direita
	public No(Integer valor, No direita, No esquerda) {
		this.valor = valor;
		this.direita = direita;
		this.esquerda = esquerda;
	}


	public void setNull() {
		valor = 0; 
		direita = null;
		esquerda = null;
	}

	public Integer getValor() {
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
	
	
	
}

package arvoreBinaria;

public class No {
	
	No direita, esquerda, folha;
	private int valor;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No(int valor) {
		this.valor = valor;
	}
	
}

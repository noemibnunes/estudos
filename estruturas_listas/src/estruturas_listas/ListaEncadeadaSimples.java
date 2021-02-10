package estruturas_listas;

public class ListaEncadeadaSimples {

	// referencia para o prox elemento da lista
	private ListaEncadeadaSimples prox, ant;
	
	// inserção
	private Object item;
	
	public ListaEncadeadaSimples(Object item) {
		this.item = item;
		prox = null;
	}	

	public ListaEncadeadaSimples getProx() {
		return prox;
	}

	public void setProx(ListaEncadeadaSimples prox) {
		this.prox = prox;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
	
	public ListaEncadeadaSimples getAnt() {
		return ant;
	}

	public void setAnt(ListaEncadeadaSimples ant) {
		this.ant = ant;
	}
}

package estruturas_listas;

public class EstruturaEncadeada {
	
	// referencia ao inicio e fim da lista
	private ListaEncadeadaSimples cabeca, calda;
	private int size;
	
	public int size() {
		return size;
	}
	
	private boolean estaVazia() {
		return cabeca == null;
	}
	
	public void addInicio(Object item) {
		ListaEncadeadaSimples novo = new ListaEncadeadaSimples(item);
		
		if(estaVazia()) {
			cabeca = novo;
			calda = novo;
		} else {
			// novo aponta para cabeca
			novo.setProx(cabeca);
			cabeca = novo;
		}
		size++;
	}
	
	public Object RemoverInicio(Object item) {
		
		if(estaVazia()) return null;
		ListaEncadeadaSimples aux = cabeca;
		cabeca = aux.getProx(); // cabeca agora é prox
		aux.setProx(null); // anterior = null, perdemos a referencia da cabeca
		
		size--;
		
		return aux.getItem();				
	}
	
	public void addFim(Object item) {
		ListaEncadeadaSimples novo = new ListaEncadeadaSimples(item);
		
		if(estaVazia()) {
			cabeca = novo;
			calda = novo;
		} else {
			// novo aponta para cabeca
			calda.setProx(novo);
			calda = novo;
		}
		size++;
	}
	
	public Object RemoverFim(Object item) {
		
		if(estaVazia()) return null;
		
		ListaEncadeadaSimples aux = cabeca;
		
		while(aux != null) {
			if (aux.getProx() == calda) {
				ListaEncadeadaSimples aux2 = calda;
				calda = aux;
				calda.setProx(null); // cortando a referencia com o ultimo no
				return aux2.getItem();
			} 		
			aux = aux.getProx();	
		}
		size--;
		return null;
	} 
	
	public Object imprimir() {
		return cabeca;
		
	}
	
}

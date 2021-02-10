package estruturas_listas;

public class EstruturaDuplamenteEncadeada {
	
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
				cabeca.setAnt(novo); 
				novo.setProx(cabeca);
				cabeca = novo;
			}
			size++;
		}
		
		public Object RemoverInicio() {
			
			if(estaVazia()) return null;
			ListaEncadeadaSimples aux = cabeca;
			
			if(cabeca.getProx() != null) {
				cabeca = cabeca.getProx();
				cabeca.getAnt().setProx(null);
				cabeca.setAnt(null);
			} else {
				cabeca = null;
				calda = null;
			}
			
			size--;
			
			return aux.getItem();				
		}
		
		public void addFim(Object item) {
			ListaEncadeadaSimples novo = new ListaEncadeadaSimples(item);
			
			if(estaVazia()) {
				cabeca = novo;
				calda = novo;
			} else {
				novo.setAnt(calda);
				calda.setProx(novo);
				calda = novo;
			}
			size++;
		}
		
		public Object RemoverFim() {
			
			if(estaVazia()) return null;
			ListaEncadeadaSimples aux = calda;
			
			if(calda.getAnt() != null) {
				calda = calda.getAnt();
				calda.getProx().setAnt(null);
				calda.setProx(null);
			} else {
				cabeca = null;
				calda = null;
			}
			
			size--;
			
			return aux.getItem();				
		} 
		
}

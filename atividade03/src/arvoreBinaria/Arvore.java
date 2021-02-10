package arvoreBinaria;

public class Arvore {
	
	int folhas = 0;
	
	public void excluir(No no) {
		
		if (no != null) {
			
			if(no.direita == null && no.esquerda == null) {
				no = null;
			} else {
				excluir(no.esquerda);
				excluir(no.direita);
			}
		}
		
	}
	
	public void preOrdem(No no) {
		if(no != null) {
			System.out.println(no.getValor());
			preOrdem(no.esquerda);
			preOrdem(no.direita);
		}
	}
	
	//public int quantidadeDeFolhas(Arvore arv) {}

}

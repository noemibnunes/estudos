package arvoreBinaria;

public class ArvoreBinaria {
	
	private No raiz = null;
	
	public No getRaiz() {
		return raiz;
	}
	
	public void inserir(Integer valor) {
		raiz = inserir(raiz, valor);
	}

	private No inserir(No no, Integer valor) {
		
		//arvore vazia, novo nó criado no else
		if (!eVazio(no)) {
			// verifica se o valor a ser inserido é menor do que estamos no momento (inseri a esquerda)
			if (valor < no.getValor()) {
				if (no.getEsquerda() != null) { 
					// percorre novamente, passando um novo no
					inserir(no.getEsquerda(), valor);
				} else {
					// quando o no.esquerda == null
					System.out.println("Inserindo " + valor + " a esquerda de " + no.getValor());
					no.setEsquerda(new No(valor));
				}
						
			// se o valor a ser inserido é maior do que estamos no momento (inseri a direita)
			} else if(no.getDireita() != null) {
					inserir(no.getDireita(), valor);
				} else {
					System.out.println("Inserindo " + valor + " a direita de " + no.getValor());
					no.setDireita(new No(valor));
				}
		} else {
			no = new No(valor);
		} 
		return no;
	}

	// metódo que verifica se está vazio ou não
	private boolean eVazio(No no) {
		return no == null;
	}
	
	// Busca em árvore binária - EmOrdem, PreOrdem, PosOrdem
	
	public void emOrdem(No no) {
		if(no != null) {
			emOrdem(no.getEsquerda());
			System.out.println(no.getValor());
			emOrdem(no.getDireita());
		}
	}
	
	public void preOrdem(No no) {
		if(no != null) {
			System.out.println(no.getValor());
			preOrdem(no.getEsquerda());
			preOrdem(no.getDireita());
		}
	}
	
	public void posOrdem(No no) {
		if(no != null) {
			posOrdem(no.getDireita());
			System.out.println(no.getValor());
			posOrdem(no.getEsquerda());
		}
	}
	
	// Impressão da árvore 
	public void imprimirArvore() {
		if (this.raiz == null)
			System.out.println("Árvore vazia");
		else
			imprimirArvore(this.raiz);
	}

	private void imprimirArvore(No no) {
		if (no.getEsquerda() != null) {
			imprimirArvore(no.getEsquerda());
		}
		if (no.getDireita() != null) {
			imprimirArvore(no.getDireita());
		}
		System.out.println("Nó: " + no.getValor());
	}
	
	// Contando a quantidade de nó que a árvore possui
	
	public int getQtdNo() {
		return getQtdNode(raiz);
	}

	private int getQtdNode(No no) {
		if (eVazio(no)) {
			return 0;
		}
		
		int qtdNodeEsq = getQtdNode(no.getEsquerda());
		int qtdNodeDireita = getQtdNode(no.getDireita());
		return qtdNodeEsq + qtdNodeDireita + 1;
	}
	
	// Mostrar qual Nó é a raiz da árvore
	public void exibirRaiz() {
		if (eVazio(raiz)) {
			System.out.println("Àrvore vazia!");
		}

		System.out.println("Nó raiz " + raiz.getValor());
	}
	
	public int setQtdNoNFolha() {
		return getQtdNoNaoFolha(raiz);
	}
	
	private int getQtdNoNaoFolha(No raiz) {
		int qtdNodeEsq = 0;
		int qtdNodeDireita = 0;
		
		if(eVazio(raiz)) {
			return 0;
		}
		
		if(raiz.getEsquerda() != null) {
			 qtdNodeEsq = getQtdNoNaoFolha(raiz.getEsquerda());
		} else if (raiz.getDireita() != null) {
			 qtdNodeDireita = getQtdNoNaoFolha(raiz.getDireita());

		}
		
		return qtdNodeEsq + qtdNodeDireita;
		
	}

	// Mostra a quantidade de nós FOLHA que a arvore possui
	public int getQtdNoFolha() {
		return getQtdNoFolha(raiz);
	}
	
	private int getQtdNoFolha(No raiz) {
	
		if(eVazio(raiz)) {
			return 0;
		} 
		
		if(raiz.getEsquerda() == null && raiz.getDireita() == null) {
			return 1;
		}
		return getQtdNoFolha(raiz.getEsquerda()) + getQtdNoFolha(raiz.getDireita());
	}
	
	// ALTURA DA ARVORE
	public int getAltura(){
		return getAltura(raiz);
	}
	    
	private int getAltura(No raiz){
		
		if(eVazio(raiz)) {
			return 0;
		}
	       
	    int altEsq = getAltura(raiz.getEsquerda());
	    int altDir = getAltura(raiz.getDireita());
	        
	    if(altEsq > altDir){
	    	return altEsq + 1;
	    } else {
	        return altDir + 1;
	    }
	        
	 }
	
	// FUNCIONA COM UM LITTLE ERRO
	public void buscar(Integer valor) {
		buscar(raiz, valor);
	}
	
	private No buscar(No raiz, Integer valor) {
		
		//arvore vazia, novo nó criado no else
		if (!eVazio(raiz)) {
			
			if(raiz.getValor().equals(valor)) {
				return raiz;
			} else {
				if(valor > raiz.getValor()) {
					buscar(raiz.getEsquerda(), valor);
					System.out.println("Valor " + valor + " encontrado a direita");
				} else {
					buscar(raiz.getDireita(), valor);
					System.out.println("Valor " + valor + " encontrado a esquerda");
				}
			}
					
		}
		return null;
		
	}
	
}

package questao3;

public class ArvoreBinaria {
	
	private No raiz = null;
	
	// INSERÇÃO NA ÁRVORE
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
	
	// PERCURSOS NA ÁRVORE BINÁRIA - EmOrdem, PreOrdem, PosOrdem
	
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
	
	// CONTANDO A QUANTIDADE DE NÓS
	public int getQtdNo() {
		return getQtdNode(raiz);
	}

	private int getQtdNode(No no) {
		if (eVazio(no)) {
			return 0;
		}
			
		int qtdNoEsq = getQtdNode(no.getEsquerda());
		int qtdNoDireita = getQtdNode(no.getDireita());
		return qtdNoEsq + qtdNoDireita + 1;
	}
	
	// SOMANDO NÓS DA SUB-ESQUERDA + SUB-DIREITA
	public int somaNo() {
		return somaNo(raiz);
	}

	private int somaNo(No no) {
		if (eVazio(no)) {
			return 0;
		}
			
		int qtdNoEsq = somaNo(no.getEsquerda());
		int qtdNoDireita = somaNo(no.getDireita());
		return qtdNoEsq + qtdNoDireita;
	}

}

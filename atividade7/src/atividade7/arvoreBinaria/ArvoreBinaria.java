package atividade7.arvoreBinaria;


public class ArvoreBinaria {

private No raiz = null;

	public No getRaiz() {
		return raiz;
	}
	
	
	
	// met�do que verifica se est� vazio ou n�o
	private boolean eVazio(No no) {
		return no == null;
	}
	
	
	// Contando a quantidade de n� que a �rvore possui
	
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
	
	// Mostrar qual N� � a raiz da �rvore
	public void exibirRaiz() {
		if (eVazio(raiz)) {
			System.out.println("�rvore vazia!");
		}
	
		System.out.println("N� raiz " + raiz.getValor());
	}
	
	// Contando a quantidade de n� n�o folha que a �rvore possui

	public int setQtdNoNFolha() {
		return getQtdNoNaoFolha(raiz);
	}
	
	private int getQtdNoNaoFolha(No no) {
		
		if (eVazio(no)) {
			return 0;
		}
		
		int qtdNoEsq = 0;
		int qtdNoDireita = 0;
		
		if(no.getDireita() != null && no.getEsquerda() != null) {
			qtdNoEsq = getQtdNoNaoFolha(no.getEsquerda());
		} else {
			qtdNoDireita = getQtdNoNaoFolha(no.getDireita());
		} 
		return qtdNoEsq + qtdNoDireita + 1;
	}
	
	// Contando a quantidade de n� folha que a �rvore possui

	
	public int getQtdNoFolha() {
		return getQtdNoFolha(raiz);
	}
	
	private int getQtdNoFolha(No atual) {
		
		if(eVazio(atual)) {
			return 0;
		} 
		
		if(atual.getEsquerda() == null && atual.getDireita() == null) {
			return 1;
		}
		return getQtdNoFolha(atual.getEsquerda()) + getQtdNoFolha(atual.getDireita());
	}

}

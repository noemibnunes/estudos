package arvoreBinaria;

public class MainTree {
	
	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
						
		arvore.inserir(3);
		arvore.inserir(6);
		arvore.inserir(1);
		
		
		
		arvore.imprimirArvore();
		
		System.out.println("�rvore possui: " + arvore.getQtdNo()+ " n�s");
		System.out.println("�rvore possui: " + arvore.setQtdNoNFolha()+ " de n�s n�o folha");
		System.out.println("�rvore possui: " + arvore.getQtdNoFolha()+ " de n�s folha");
		System.out.println("Altura da �rvore: " + arvore.getAltura());

		arvore.exibirRaiz();
	
		arvore.buscar(1);
		
	}

}

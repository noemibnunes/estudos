package arvoreBinaria;

public class MainTree {
	
	public static void main(String[] args) {
		
		ArvoreBinaria arvore = new ArvoreBinaria();
						
		arvore.inserir(3);
		arvore.inserir(6);
		arvore.inserir(1);
		
		
		
		arvore.imprimirArvore();
		
		System.out.println("Àrvore possui: " + arvore.getQtdNo()+ " nós");
		System.out.println("àrvore possui: " + arvore.setQtdNoNFolha()+ " de nós não folha");
		System.out.println("àrvore possui: " + arvore.getQtdNoFolha()+ " de nós folha");
		System.out.println("Altura da árvore: " + arvore.getAltura());

		arvore.exibirRaiz();
	
		arvore.buscar(1);
		
	}

}

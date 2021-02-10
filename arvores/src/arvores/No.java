package arvores;

public class No {
	
	// No raiz
	private static No raiz;

	// valor a ser inserido
	private int valor;
	
	// apontadores
	private No esquerda;
	private No direita;
	
	// metodo construtor - recebe um valor
	public No(int valor) {
		this.valor = valor;
	}
	
	// recebe um valor do usuário e chama o metódo inserir para realizar a inserção
	public static void inserir(int valor) {
		inserir(raiz, valor);
	}
	
	public static void inserir (No no, int valor) {
		
		//arvore vazia, novo nó criado que se torna a raiz
		if (no == null) {
			raiz = new No(valor);
			
		} else {
			// verifica se o valor a ser inserido é menor do que estamos no momento (inseri a esquerda)
			if (valor < no.valor) {
				if (no.esquerda != null) {
					// percorre novamente, passando um novo no
					inserir(no.esquerda, valor);
				} else {
					// quando o no.esquerda == null
					System.out.println("Inserindo " + valor + " a esquerda de " + no.valor);
					no.esquerda = new No(valor);
				}
				
			// se o valor a ser inserido é maior do que estamos no momento (inseri a direita)
			} else {
				if(no.direita != null) {
					inserir(no.direita, valor);
				} else {
					System.out.println("Inserindo " + valor + " a direita de " + no.valor);
					no.direita = new No(valor);
				}
			}
		}
	}

}

package questao4;

public class MainTesta {
	
	public static void main(String[] args) throws ListaLotadaException {
		
		GonzagaList l1 = new GonzagaList();
		
		l1.adicionar(1);
		l1.adicionar(3);
		l1.adicionar(5);
		
		System.out.println(l1.tamanho());
	}


}

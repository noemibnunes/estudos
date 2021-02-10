package questao4;

public class GonzagaList {
	
	private static final int TAMANHO_INICIAL = 10;
	
	private int lista;
	
	private Integer[] arrayInicio = new Integer [TAMANHO_INICIAL];

	
	public int tamanho() {
		return lista;
	}
	
	public void adicionar(Integer num) throws ListaLotadaException{
		
		if(lista == arrayInicio.length) {
			
			if(arrayInicio.length == 100) {
				throw new ListaLotadaException();
			} else{
				Integer[] novoArray = new Integer [arrayInicio.length + TAMANHO_INICIAL];
				
				for (int i = 0; i < arrayInicio.length; i++) {
					novoArray[i] = arrayInicio[i];
				}
				arrayInicio = novoArray;
			}
		
		}
		
		arrayInicio[lista]= num;
		lista++;
	}

}
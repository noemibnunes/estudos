package atividade2.questao2;

import java.util.HashSet;
import java.util.TreeSet;

public class ClasseDesempenho {
	
	public static void main(String[] args) {
		
		TreeSet<Pessoa> treeset = new TreeSet<Pessoa>();
		HashSet<Pessoa> hashset = new HashSet<Pessoa>();

	
		Pessoa p = new Pessoa("Noemi", 1598746022, 18, "F");
		
		//HASHSET
		long inicio = System.nanoTime();
		
		hashset.add(p);		
		hashset.remove(p);
		hashset.contains(p);
				
		long fim = System.nanoTime();
		long duracao = fim - inicio;
		
		System.out.println("Inserção do hashset durou: " + duracao);
		
		//TREESET
		inicio = System.nanoTime();
		
		treeset.add(p);	
		treeset.remove(p);
		treeset.contains(p);
		
		fim = System.nanoTime();
		duracao = fim - inicio;
		
		System.out.println("Inserção do treeset durou: " + duracao);
	}

}

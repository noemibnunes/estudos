package Grafo;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class GrafoAmigo {
	
	ArrayList<Amigo> visitados;
	
	public void criarAmizade(Amigo amg1, Amigo amg2) {
		amg1.Amizade(amg2);
		amg2.Amizade(amg1);
	}
	
	public void buscaEmProf(Amigo amigo) {
		visitados = new ArrayList<Amigo>();
		realBuscaEmProfu(amigo);
	}

	private void realBuscaEmProfu(Amigo amigo) {
		if(!visitados.contains(amigo)) {
			System.out.println(amigo.toString() + "Busca em profundidade");
			visitados.add(amigo);
			
			for (Amigo a: amigo.getAmigos()){
				realBuscaEmProfu(amigo);
			}
		}
	}
	
	public void buscarEmLargura(Amigo amigo) {
		ArrayDeque<Amigo> fila = new ArrayDeque<>();
		
		visitados = new ArrayList<Amigo>();
		
		fila.push(amigo);
		while (!fila.isEmpty()) {
			Amigo a = fila.remove();
			System.out.println(a.toString());
			
			for(Amigo iterator: a.getAmigos()) {
				if(!visitados.contains(iterator)) {
					fila.push(iterator);
					visitados.add(iterator);
				}
			}
		}
	}

}

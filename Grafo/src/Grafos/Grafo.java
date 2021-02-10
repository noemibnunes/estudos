package Grafos;

import java.util.ArrayList;

// Grafo generico pode ser qualquer tipo - String, int
public class Grafo <TIPO> {
	
	private ArrayList<Vertices<TIPO>> vertices;
	private ArrayList<Arestas<TIPO>>arestas;
	
	// inicializando os arrays 
	public Grafo() {
		this.vertices = new ArrayList<Vertices<TIPO>>();
		this.arestas = new ArrayList<Arestas<TIPO>>();

	}
	
	public void adicionarVertice(TIPO dado) {
		
		Vertices<TIPO> novo = new Vertices<TIPO>(dado);
		this.vertices.add(novo);
		
	}
	
	public void adicionarAresta(Double peso, TIPO inicio, TIPO fim) {
		
	}
	
	
	
	

}

package Grafos;

import java.util.ArrayList;

public class Vertices <TIPO>{
	
	private TIPO dado;
	private ArrayList<Arestas<TIPO>> arestasE;
	private ArrayList<Arestas<TIPO>> arestasS;

	
	public Vertices(TIPO valor) {
		this.dado = valor;
		this.arestasE = new ArrayList<Arestas<TIPO>>();
		this.arestasS = new ArrayList<Arestas<TIPO>>();

	}

	public TIPO getDado() {
		return dado;
	}

	public void setDado(TIPO dado) {
		this.dado = dado;
	}
	
	public void adicionarArestaE(Arestas<TIPO> aresta) {
		this.arestasE.add(aresta);
	}
	
	public void adicionarArestaS(Arestas<TIPO> aresta) {
		this.arestasS.add(aresta);
	}
	

}

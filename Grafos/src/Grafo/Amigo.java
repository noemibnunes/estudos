package Grafo;

import java.util.ArrayList;

public class Amigo {
	
	private String nome;
	private int grau;
	private ArrayList<Amigo> amigos = new ArrayList<>();
	
	public Amigo(String nome) {
		this.nome = nome;
	}
	
	public void Amizade(Amigo amigo) {
		
		if(!isAmigo(amigo)) {
			amigos.add(amigo);
			grau +=1;
		}
	}

	private boolean isAmigo(Amigo amigo) {
		for(Amigo a : this.amigos) {
			if(a == amigo) {
				return true;
			}
		}
		return false;
	}
	
	public ArrayList<Amigo> getAmigos(){
		return this.amigos;
	}
	
	public String toString() {
		return this.nome;
	}
}

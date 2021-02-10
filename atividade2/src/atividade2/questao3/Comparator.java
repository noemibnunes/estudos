package atividade2.questao3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Comparator {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Scanner teclado = new Scanner(System.in);

		boolean continuar = true;
		int escolha = 0;
		
		System.out.println("Adicione um número a lista: ");
		int num = teclado.nextInt();

		while (continuar == true) {
			
			System.out.println("Deseja adicionar outro número a lista? Use 0 - sim e 1 - não ");
			escolha = teclado.nextInt();
			
			if (escolha == 0) {
				num = teclado.nextInt();
				lista.add(num);
				
				continuar = true;
			} else {
				continuar = false;
			}
						
		}
		
		Collections.reverse(lista);		
		System.out.println("lista:" + lista);
			
	}
		
	
}

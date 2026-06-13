package com.POO.BuscaArray;

import java.util.Scanner;
import java.util.ArrayList;

public class BuscaArray {

	Scanner leia = new Scanner(System.in);
	private int numeros[] = {0,1,2,3,4,5,6,7,8,9,10};
	private int indice = -1; // significa 'não encontrado'
	
	public BuscaArray() {
	
		int escolha = 3;
		
		do {
			
			System.out.println("""
					
					1 = Modo primitivo
					2 = Modo atual 
					3 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				System.out.println("Digite um numero entre 0 e 10: ");
				int valor = leia.nextInt();
				
				for(int i = 0; i < numeros.length; i++) {
					if(numeros[i] == valor) {
						indice = i; // define como valor encontrado
						break;
					}
				}
				System.out.println("Numero escolhido: " + indice);
			} // ->> esse modo é utilizado para buscas mais rapidas e estaticas (arrays que não mudam seu valor)
			break;
			case 2:
				
				System.out.println("Digite um numero entre 0 e 10: ");
				int valor = leia.nextInt();
				
				ArrayList<Integer> valores = new ArrayList<>();
				valores.add(0);
				valores.add(1);
				valores.add(2);
				valores.add(3);			  // ->> Exemplo de Array List
				valores.add(4);   	     
				valores.add(5);			// ->> esse método é comumente usado para quando for adicionar futuramente valores a uma array
				valores.add(6);		   // ->> recomendado para projetos q futuramente vão receber atualizações
				valores.add(7);		  // ->> não recomendado para ser utilizado IGUAL ao exemplo (muita linha de codigo desnecessaria)
				valores.add(8);
				valores.add(9);
				valores.add(10);
				
				int alvo = valor;
				
				if(alvo == valor) {
					indice = valores.indexOf(alvo);
				}
				
				System.out.println("Numero escolhido: " + indice); 
			break;
			case 3:
				break;
			default:
				throw new IllegalArgumentException("Valor inesperado: " + escolha);
			}
			
		}while(escolha != 3);
	}	
}

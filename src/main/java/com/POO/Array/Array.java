package com.POO.Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	// Encontrar o maior número de um array
	
	public Array() {
		
		Scanner leia = new Scanner(System.in);
		int escolha = 3;
		
		do {
			System.out.println("""
					1 = Utilizando a API de Streams (Java 8+)
					2 = Forma mais otimizada
					3 = Sair
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: { // -> Blocos utilizados para não dar conflito de variável
					// irei usar as mesmas variaveis para alocar os mesmos valores nas próximas cases
				int numeros[] = {10, 40, 20, 50, 30};
				int maior = Arrays.stream(numeros).max().orElseThrow();
				
				System.out.println("O Array de 'numeros' tem os valores: 10, 20, 30, 40, 50");
				System.out.println("Portanto, o maior valor é: " + maior);
			}
			break;
			case 2: {
				int numeros[] = {10, 40, 20, 50, 30};
				int maior = numeros[4];
				
				if(numeros == null) {
					System.out.println("A array não pode estar vazia");
					continue;
				}
				
				for (int i = 1; i < numeros.length; i++) {
					if(numeros[i] > maior) {
						maior = numeros[i];
					}
				}
				System.out.println("O Array de 'numeros' tem os valores: 10, 20, 30, 40, 50");
				System.out.println("Portanto, o maior valor é: " + maior);
			}
			break;
			case 3:
				break;
			default:
				System.out.println("Operação não encontrada");
			}
		} while (escolha != 3);
	}
}
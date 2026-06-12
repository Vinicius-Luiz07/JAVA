package com.POO.ArrayPares;

import java.util.Scanner;

public class ArrayPares {
	
	// Achar numeros pares dentro de um vetor
	
	Scanner leia = new Scanner(System.in);
	
	public ArrayPares() {
		
		int escolha = 2;
		
		do {
			
			System.out.println("""
					
					1 = Sistema
					2 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				
				int numeros[] = new int[5];
				
				System.out.println("Digite 5 valores, entre numeros pares e impares");
				
				for(int i = 0; i < numeros.length; i++) {
					String valor = leia.next(); // lê primeiro em String
					try {
						numeros[i] = Integer.parseInt(valor); // converte o valor de string para int
						
					} catch (Exception e) {
						System.out.println("Erro: " + e.getMessage()); // mensagem de erro (para n quebrar o codigo)
						break;
					}
					
					if(numeros[i] %2 == 0) { // esse IF vai pegar os valores da array e 
						System.out.println(numeros[i] + " é um número par");
					}else {
						System.out.println(numeros[i] + " é um número impar");
					}
				}
			}
			case 2:
				break;
			default:
				System.out.println("Erro");
			}
		} while(escolha != 2);
	}
}

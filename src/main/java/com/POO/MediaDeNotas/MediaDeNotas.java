package com.POO.MediaDeNotas;

import java.util.Scanner;

public class MediaDeNotas {

	private double media;
	
	Scanner leia = new Scanner(System.in);
	
	public MediaDeNotas() {
		
		int escolha = 2;
		
		do {
			
			System.out.println("""
					
					1 = Sistema de média
					2 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				
				double nota [] = new double[5];
				
					System.out.println("Digite suas 5 notas: ");
					
					// atribuição dos valores no vetor de NOTA e lógica da média
					for(int i = 0; i < nota.length; i++) {
						String entrada = leia.next();// primeiro lê o valor como string
						
						try {		
							nota[i] = Double.parseDouble(entrada); // converte o valor de String para Double
							media += nota[i] / 5; // lógica da média
							
						} catch(NumberFormatException e) {
							System.out.println("Erro: " + e.getMessage()); // mensagem de erro se o valor da string for caracter e não numero
							break; // quebra o codigo se o valor for caracter
						}
					}
					
					System.out.println("Média final: " + media);
					media = 0.0; // reseta o valor da variavel, caso o codigo seja rodado mais de 1 vez, o valor atual não será somado com o valor antigo
				}
			case 2:
				break;
				
			default:
				System.out.println("Valor não encontrado");
				break;
			}
		} while (escolha != 2);
	}
}

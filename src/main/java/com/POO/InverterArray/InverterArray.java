package com.POO.InverterArray;

import java.util.Scanner;

public class InverterArray {
	
	int valores[] = {0,1,2,3,4,5,6,7,8,9,10};
	
	public InverterArray() {
		
		int escolha = 2;
		Scanner leia = new Scanner(System.in);
		
		do {
			
			System.out.println("""
					
					1 = Sistema
					2 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				
				for(int i = 1; i < valores.length; i++) {
					System.out.println("Valores na ordem correta = " + valores[i]);
				}
				
				System.out.println("==============================");
			
				for(int i = valores.length - 1;i < valores.length ; i--) {
					try {
						if(valores[i] == 0) {
							break;
						}
					} catch (Exception e) {
						System.out.println("Error: " + e.getMessage());
					}
					System.out.println("Valores na ordem contraria = " + valores[i]);
				}
			}
			case 2: 
				break;
			default:
				throw new IllegalArgumentException("Valor inesperado: " + escolha);
			}
		}while(escolha != 2);
	}
}
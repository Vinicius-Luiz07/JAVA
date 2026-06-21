package com.POO.Advinhacao;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;
import java.util.Scanner;

public class GameDivination {
	
	/* O computador gera número aleatório.

	Usuário tenta acertar.

	O computador dá dicas:

	->> maior ou menor

	*/
	
	Scanner manga = new Scanner(System.in);
	
	public GameDivination() {
		
		int kiwi = 2;
		
		do {
			
			System.out.println("""
					
					1 = Joguin
					2 = Sair
					
					""");
				kiwi = manga.nextInt();
				
			switch (kiwi) {
			case 1: {
				
				try {
				    	RandomGenerator gelado = RandomGeneratorFactory.of("Random").create();

				        int numeroSecreto = gelado.nextInt(31);
				        
				        int goiaba;

				        while (true) {

				            System.out.print("Escolha um valor entre 0 e 30: ");
				            goiaba = manga.nextInt();

				            if (goiaba < numeroSecreto) {
				                System.out.println("O numero escolhido é maior");
				            } else if (goiaba > numeroSecreto) {
				                System.out.println("O numero escolhido é menor");
				            } else {
				                System.out.println("Acertou! O valor escolhido foi: "+ numeroSecreto);
				                break;
				            }
				        }
					
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				
			}
			case 2:
				break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + kiwi);
			}
		}while(kiwi != 2);
	}
}
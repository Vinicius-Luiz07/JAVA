package com.POO.Login;

import java.util.Scanner;

public class Escolha {

	public Escolha() {
		
		Scanner leia = new Scanner(System.in);
		int escolha = 2;
		
		do{
			
			System.out.println("""
					
					1 = Sistema de Login
					2 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1:
				Login db = new Login();
				System.out.println(db);
				break;
			case 2:{
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
			
		} while(escolha != 2);
		
	}
}

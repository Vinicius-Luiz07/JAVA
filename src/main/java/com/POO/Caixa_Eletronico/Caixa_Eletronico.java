package com.POO.Caixa_Eletronico;

import java.util.Scanner;

public class Caixa_Eletronico {

	Scanner leia = new Scanner(System.in);
	int saldo;
	
	public void Caixa() {
		
		int escolha = 2;
		
		do {
			
			System.out.println("""
					1 = Sistema
					2 = Sair
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1:
				Sistema();
				break;
			case 2:
			break;
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
			
		} while(escolha != 2);
	}
	
	public void Sistema() {
		
		int escolha = 4;
		
		do {
			
			System.out.println("""
					
					1 = Depositar
					2 = Sacar
					3 = Saldo
					4 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1:
				Depositar();
			break;
			case 2:
				Sacar();
			break;
			case 3:
				Saldo();
			break;
			case 4: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
			
		} while(escolha != 4);
	}
	
	public int Depositar(){
		System.out.println("Digite um valor para depositar: ");
		int valor = leia.nextInt();
		
		System.out.println("valor depositado, valor de: R$" + valor);
		
		return valor;
	}
	
	public int Sacar() {
		System.out.println("Digite um valor para sacar: ");
		int valor = leia.nextInt();
		
		System.out.println("valor sacado, valor de: R$" + valor);
	
		return valor;
	}
	
	public int Saldo() {
		
		
		
		return getSaldo();
	}
	
	public Caixa_Eletronico() {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	
}

package com.POO.Login;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;
import java.awt.event.InputEvent;
import java.awt.im.InputContext;
import java.util.HashMap;
import java.util.Map;

public class Login {
	
	Scanner leia = new Scanner(System.in);
	int escolha = 4;
	
	public void Escolha() {
		
		do{
			
			System.out.println("""
					
					1 = Sistema de Login
					2 = Sair
					
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				Login db = new Login();
				System.out.println(db);
			}
			case 2:{
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
			
		} while(escolha != 2);
		
	}
	
	public static Map<String, Integer> BancoDeDados() {
		
		Map<String, Integer> usuarios = new HashMap<>();
		
		usuarios.put("Administrador", 1234);
		usuarios.put("Computador 1", 5678);
		usuarios.put("Computador 2", 9101);
		
		return usuarios;
	}
	
	public Login() {
		
		Map<String, Integer> db = BancoDeDados();
		String usuarioSelecionado = "";
		
		CountDownLatch latch = new CountDownLatch(1);
		
		do {
			
			System.out.println("""
					1 = Administrador
					2 = Computador 1
					3 = Computador 2
					4 = Sair;
					""");
			escolha = leia.nextInt();
			
			switch (escolha) {
			case 1: {
				System.out.println("Digite a senha:");
				int senha = leia.nextInt();
				
				try {
					
					usuarioSelecionado = "Administrador";
					
					Integer senhaCerta = db.get(usuarioSelecionado);
					
					if(senhaCerta != null && senha == senhaCerta) {
						System.out.println("Acesso permitido!");
						break;
					} else if(senhaCerta != null && senha != senhaCerta ) {
						System.out.println("Acesso negado!");
						
						for(int i = 1; i < 3; i++) {
							if(senha == i) {
								System.out.println("Limite de tentativas!");
							}
						}
						
						latch.await();
						
					} else if(senhaCerta == null) {
						System.out.println("Erro, insira uma senha:");
						continue;
					}
					
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				
			}
			case 2: {
				
			}
			case 3:{
				
			}
			case 4:{
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + escolha);
			}
		}while(escolha != 4);
	}
}
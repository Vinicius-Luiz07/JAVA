package com.POO.Login;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Login {
	
	public static Map<String, String> BancoDeDados() {
		
		Map<String, String> usuarios = new HashMap<>();
		
		usuarios.put("Administrador", "1234");
		usuarios.put("Computador1", "5678");
		usuarios.put("Computador2", "9101");
		
		return usuarios;
	}
	
	public Login() {
		
		Map<String, String> db = BancoDeDados();
		String usuarioSelecionado = "";		
		
		Scanner leia = new Scanner(System.in);
		int escolha = 4;
		
		do {
			
			System.out.println("""
					
					1 = Administrador
					2 = Computador 1
					3 = Computador 2
					4 = Sair;
					
					""");
			
			escolha = leia.nextInt();
			
			boolean acessoPermitido = false;
			int tentativas = 0;
			int limiteTentativas = 3;
			
			switch (escolha) {
			case 1: {
				try {
					
					usuarioSelecionado = "Administrador";
					String senhaCerta = db.get(usuarioSelecionado);		
					String senha = "";
						
						while(tentativas < limiteTentativas && !senha.equals(senhaCerta)) {
							System.out.println("Digite a senha:");
							senha = leia.nextLine();
							
							if(senha == null) {
								System.out.println("Por favor, insira uma senha.");
								continue;
							}
							
							if(senha.equals(senhaCerta)) {
								System.out.println("Acesso permitido!");
								acessoPermitido = true;
								break;
							} else {
								tentativas++;
								System.out.println("Senha incorreta!");
							}
						}
						
						if(!acessoPermitido) {
							System.out.println("Limite máximo de tentativas atingido. Acesso bloqueado.");
					}
						
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			}
			case 2: {
				try {
					usuarioSelecionado = "Computador1";
					String senhaCerta = db.get(usuarioSelecionado);			
					String senha = "";
						
						while(tentativas <= limiteTentativas && !senha.equals(senhaCerta)) {
							System.out.println("Digite a senha:");
							senha = leia.nextLine();
							
							if(senha == null) {
								System.out.println("Por favor, insira uma senha.");
								continue;
							}
							
							if(senha.equals(senhaCerta)) {
								System.out.println("Acesso permitido!");
								acessoPermitido = true;
								break;
							} else {
								tentativas++;
								System.out.println("Senha incorreta!");
							}
						}
						
						if(!acessoPermitido) {
							System.out.println("Limite máximo de tentativas atingido. Acesso bloqueado.");
					}
						
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
			}
			case 3:{
				try {
					usuarioSelecionado = "Computador2";
					String senhaCerta = db.get(usuarioSelecionado);			
					String senha = "";
						
						while(tentativas <= limiteTentativas && !senha.equals(senhaCerta)) {
							System.out.println("Digite a senha:");
							senha = leia.nextLine();
							
							if(senha == null) {
								System.out.println("Por favor, insira uma senha.");
								continue;
							}
							
							if(senha.equals(senhaCerta)) {
								System.out.println("Acesso permitido!");
								acessoPermitido = true;
								break;
							} else {
								tentativas++;
								System.out.println("Senha incorreta!");
							}
						}
						
						if(!acessoPermitido) {
							System.out.println("Limite máximo de tentativas atingido. Acesso bloqueado.");
					}
						
				} catch (Exception e) {
					System.out.println("Error: " + e.getMessage());
				}
				break;
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
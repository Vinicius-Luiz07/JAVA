package com.POO.Regras_de_voto;

import java.util.Scanner;

public class ValidadorDeVoto extends Setters_And_Getters {
    
    Scanner leia = new Scanner(System.in);

    public ValidadorDeVoto() {

        do {
            try {
                // VALIDAÇÃO DO TITULO
                System.out.println("Você tem titulo?\n 1 = Sim\n 2 = Não\n 3 = Sair");
                setTitulo(leia.nextInt());

                if (getTitulo() < 1 || getTitulo() > 3) {
                    throw new Exception("Operação inválida! Digite 1, 2 ou 3.");
                }

                setTitulo(getTitulo()); // SALVA 1, 2 OU 3

                if (getTitulo() == 2) {
                    System.out.println("Você não tem título, logo, não pode votar.");
                    continue; // REPETE O MENU (PERGUNTA TÍTULO NOVAMENTE)
                } 

                if (getTitulo() == 3) {
                    break; // PARA DE COMPILAR O CODIGO
                }

                // VALIDAÇÃO DA IDADE

                System.out.println("Digite sua idade: ");
                setIdade(leia.nextInt());                
            
                if (getIdade() >= 18 && getIdade() <= 69) {
                    System.out.println("Você é obrigado a votar!");
                } else if (getIdade() >= 16 && getIdade() < 18 || getIdade() >= 70) {
                    System.out.println("Seu voto é facultativo.");
                } else if (getIdade() < 16){
                    System.out.println("Você não tem idade para votar.");
                } 
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                leia.nextLine(); // LIMPA
            }

        } while (true);
    }
}
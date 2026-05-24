package com.POO.Tabuada_POO;

import java.util.Scanner;

public class Tabuada extends Setters_and_getters {
    
    Scanner leia = new Scanner(System.in);

    public Tabuada() {

        int escolha = 5;

        do {

            System.out.println("\nT A B U A D A\n");
            System.out.println("1 = S O M A ");
            System.out.println("2 = S U B T R A Ç Ã O");
            System.out.println("3 = M U L T I P L I C A Ç Ã O");
            System.out.println("4 = D I V I S Ã O");
            System.out.println("5 = S A I R");
            escolha = leia.nextInt();

            switch (escolha) {
                case 1: // SOMA
                    System.out.println("Digite o numero: ");
                    setEscolha(leia.nextInt());
                    for(int i = 0; i < 11; i++){
                        for (int x = i; x <= i ; x++) {
                            setResultado(getEscolha() + i);
                            System.out.println(getEscolha() + " + " + i + " = " + getResultado());
                        }
                    }
                    break;
                case 2: // SUBTRAÇÃO
                    System.out.println("Digite o numero: ");
                    setEscolha(leia.nextInt());
                    for(int i = 0; i < 11; i++){
                        for(int x = i; x <= i; x++){
                            setResultado(getEscolha() - i);
                            System.out.println(getEscolha() + " - " + i + " = " + getResultado());
                        }
                    }
                    break;
                case 3: // MULTIPLICAÇÃO
                    System.out.println("Digite o numero: ");
                    setEscolha(leia.nextInt());
                    for(int i = 0; i < 11; i++){
                        for(int x = i; x <= i; x++){
                            setResultado(getEscolha() * i);
                            System.out.println(getEscolha() + " * " + i + " = " + getResultado());
                        }
                    }
                    break;
                case 4: // DIVISÃO
                    System.out.println("Digite o numero: ");
                    setEscolha(leia.nextInt());
                    for(int i = 0; i < 11; i++){
                        for(int x = i; x <= i; x++){
                            setResultado(getEscolha() / i);
                            System.out.println(getEscolha() + " / " + i + " = " + getResultado());
                        }
                    }
                    break;
                case 5: // FECHAR O LOOPING
                    break;
                default: System.out.println("Operação inválida!");
                    break;
            }
        } while (escolha != 5);
    }
}

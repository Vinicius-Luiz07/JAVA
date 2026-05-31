package com.POO.Fatorial;

import java.util.Scanner;

public class Fatorial {

    Scanner leia = new Scanner(System.in);
    int valor;

    public Fatorial() {

        do{ // repete o processo
            System.out.println("Digite um valor >= 0: ");
            valor = leia.nextInt();
            
        } while (valor < 0) ; // se o valor for 0 || < 0 vai parar o código

        long Fatorial = 1; // Usa long para evitar estouro de memória em números maiores (diferente de int q guarda valores menores)
        for (int i = valor; i > 1; i++) {
            Fatorial *= valor;
        }
        System.out.println("O fatorial de " + valor + " é: " + Fatorial);

        // PROJETO IMCOMPLETO
    }
}
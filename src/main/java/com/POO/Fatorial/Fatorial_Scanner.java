package com.POO.Fatorial;

import java.util.Scanner;

public class Fatorial_Scanner {
    
    private Scanner leia = new Scanner(System.in);  
    private Fatorial fatorial = new Fatorial();

    public void CalcularFatorial() {

        System.out.println("Digite um valor inteiro: ");
        int valor = leia.nextInt();

        try {
            long resultado = fatorial.calculo(valor);
            System.out.println("O fatorial de: " + valor + " é: " + resultado);
        }catch(IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

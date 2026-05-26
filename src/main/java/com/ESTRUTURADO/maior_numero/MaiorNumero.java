package com.maior_numero;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        int a = ler.nextInt();

        System.out.println("Digite o segundo numero:");
        int b = ler.nextInt();

        System.out.println("Digite o terceiro numero:");
        int c = ler. nextInt();

        int maior = a;

        if(b > maior){
            maior = b;
        } else if (c > maior) {
            maior = c;
        }

        System.out.println("Maior numero: " + maior);

        /*FECHAR O SCANNER */

        ler.close();
    }
}

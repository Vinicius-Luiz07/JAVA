package com.impar_ou_par;

import java.util.Scanner;

public class ImparOuPar {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int numero;

        System.out.println("Digite um numero:");
        numero = leia.nextInt();

        if (numero %2 == 0) {
            System.out.println("impar");
        }   else {
            System.out.println("par");
        }
    }
}

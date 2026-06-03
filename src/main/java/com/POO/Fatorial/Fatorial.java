package com.POO.Fatorial;

public class Fatorial {

    // Nessa classe fica toda a lógica do algoritmo de fatorial

    public long calculo(int n) {
        
        if(n < 0){
            throw new IllegalArgumentException("número negativo não possuí fatorial");
        }

        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n *= calculo(n - 1);
    }
}
package com.POO;

import com.POO.Calculadora_POO.Calculadora;
import com.POO.Converter_Temperatura_POO.ConverterTemperatura;
import com.POO.Regras_de_voto.ValidadorDeVoto;
import com.POO.Tabuada_POO.Tabuada;
import com.POO.Soma_de_Numeros_Pares.SDNP;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calculadora = new Calculadora(); 
        System.out.println(calculadora);

        /* .:|====== && =====|:.*/

        ConverterTemperatura conversor = new ConverterTemperatura();
        System.out.println(conversor);

        /* .:|====== && =====|:.*/

        ValidadorDeVoto validador = new ValidadorDeVoto();
        System.out.println(validador);

        /* .:|====== && =====|:.*/

        Tabuada tabuada = new Tabuada();
        System.out.println(tabuada);

        /* .:|====== && =====|:.*/

        SDNP sdnp = new SDNP();
        System.out.println(sdnp.calcularSoma());

    }
}
package com.POO;

import java.util.Scanner;
import com.POO.Calculadora_POO.Calculadora;
import com.POO.Contador_Regressivo.ContadorRegressivo;
import com.POO.Converter_Temperatura_POO.ConverterTemperatura;
import com.POO.Regras_de_voto.ValidadorDeVoto;
import com.POO.Tabuada_POO.Tabuada;
import com.POO.Soma_de_Numeros_Pares.SDNP;

public class Main {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int escolha = 7; // SWITCH CASE

        do {

        System.out.println("================== PROGRAMAS ==================");
        System.out.println("1 = Calculadora\n2 = Conversor\n3 = Validador\n4 = Tabuada\n5 = Soma dos números pares\n6 = Contador Regressivo\n7 = Sair");
        escolha = leia.nextInt();

        switch (escolha) {
            case 1:
                Calculadora calculadora = new Calculadora();
                System.out.println(calculadora);
                break;
            case 2:
                ConverterTemperatura conversor = new ConverterTemperatura();
                System.out.println(conversor);
                break;
            case 3:
                ValidadorDeVoto validador = new ValidadorDeVoto();
                System.out.println(validador);
                break;
            case 4:
                Tabuada tabuada = new Tabuada();
                System.out.println(tabuada);
                break;
            case 5:
                SDNP sdnp = new SDNP();
                System.out.println(sdnp.calcularSoma());
                break;
            case 6:
                ContadorRegressivo contador = new ContadorRegressivo();
                System.out.println(contador);
                break;
            case 7:
                break;
            default:
                System.out.println("Programa não encontrado");
                break;
            }
       } while (escolha != 7);
    }
}
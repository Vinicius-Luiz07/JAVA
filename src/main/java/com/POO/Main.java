package com.POO;

import java.util.Scanner;

import com.POO.Array.Array;
import com.POO.Calculadora_POO.Calculadora;
import com.POO.Contador_Regressivo.ContadorRegressivo;
import com.POO.Converter_Temperatura_POO.ConverterTemperatura;
import com.POO.Fatorial.Fatorial_Scanner;
import com.POO.Numeros_Primos.Numeros_Primos;
import com.POO.Regras_de_voto.ValidadorDeVoto;
import com.POO.Tabuada_POO.Tabuada;
import com.POO.Soma_de_Numeros_Pares.SDNP;
import com.POO.MediaDeNotas.MediaDeNotas;
import com.POO.ArrayPares.ArrayPares;

public class Main {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);
        int escolha = 12; // SWITCH CASE

        do {

        System.out.println("================== PROGRAMAS ==================");
        System.out.println("""
            01 = Calculadora 
            02 = Conversor 
            03 = Validador
            04 = Tabuada
            05 = Soma dos números pares 
            06 = Contador Regressivo 
            07 = Fatorial
            08 = Numeros Primos
            09 = Array
            10 = Media de notas
            11 = Pares de array
            12 = Sair
            """); // Esse sistema de quebra de linhas funciona apenas no java 15+
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
                Fatorial_Scanner Fatorial = new Fatorial_Scanner();
                Fatorial.CalcularFatorial();
                break;
            case 8:
            	Numeros_Primos primos = new Numeros_Primos();
        		primos.calculo();
                break;
            case 9:
            	Array array = new Array();
            	System.out.println(array);
            	break;
            case 10:
            	MediaDeNotas media = new MediaDeNotas();
            	System.out.println(media);
            	break;
            case 11:
            	ArrayPares pares = new ArrayPares();
            	System.out.println(pares);
            	break;
            case 12:
            	break;
            default:
                System.out.println("Programa não encontrado");
                break;
            }
       } while (escolha != 12);
    }
}
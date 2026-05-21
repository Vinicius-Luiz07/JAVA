package com.POO.Converter_Temperatura_POO;

import java.util.Scanner;   

public class ConverterTemperatura extends Getter_And_Setters {
    
    Scanner leia = new Scanner(System.in);

    public ConverterTemperatura() {

        int escolha = 3;

        do { /*-> REPETIR O MENU DE ESCOLHA */

            System.out.println(".:|===========> C O N V E R T O R <==========|:.");
            System.out.println("1 = Celsius -> Fahrenheit\n2 = Fahrenheit -> Celsius");
            escolha = leia.nextInt();
            
            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor a ser convertido: ");
                    setCelsius(leia.nextDouble());
                    setOperador(getCelsius() * 1.8 + 32);
                    System.out.println("A temperatura " + getCelsius() + " Celsius, convertida para Fahrenheit, fica: " + getOperador() + "°F");
                    break;
                case 2:
                    System.out.println("Digite o valor a ser convertido: ");
                    setFahrenheit(leia.nextDouble());
                    setOperador((getFahrenheit() - 32) / 1.8);
                    System.out.println("A temperatura " + getFahrenheit() + " Fahrenheits, convertida para Celsius, fica: " + getOperador() + "°C");
                case 3:
                    break;
                default: 
                    System.out.println("Operação não encontrada !!");
                    break;
            }

        } while(escolha != 3);
    }
}
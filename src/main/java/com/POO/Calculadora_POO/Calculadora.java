package com.POO.Calculadora_POO;

import java.util.Scanner;

public class Calculadora extends Setters_And_Getters {

    Scanner leia = new Scanner(System.in);

    public Calculadora() {
    
        int escolha = 5;

        do { /* -> UTILIZADO PARA FAZER COM QUE O MENU SE REPITA PELO MENOS 1 VEZ*/

            System.out.println("Escolha a operação:\n 1 = Soma\n 2 = Subtração\n 3 = Multiplicação\n 4 = Divisão\n 5 = Sair");
            escolha = leia.nextInt(); /* -> MENU */

            switch (escolha) {
            case 1: /* -> SOMA*/
                System.out.println("Digite o primeiro numero: ");
                setNumero1(leia.nextDouble());
                System.out.println("Digite o segundo numero: ");
                setNumero2(leia.nextDouble());
                setSoma(getNumero1() + getNumero2());
                setResultado(getSoma());
                System.out.println(getResultado());
                break;
            case 2: /* -> SUBTRAÇÃO*/
                System.out.println("Digite o primeiro numero: ");
                setNumero1(leia.nextDouble());
                System.out.println("Digite o segundo numero: ");
                setNumero2(leia.nextDouble());
                setSubtracao(getNumero1() - getNumero2());
                setResultado(getSubtracao());
                System.out.println(getResultado());
                break;
            case 3: /* -> MULTIPLICAÇÃO*/
                System.out.println("Digite o primeiro numero: ");
                setNumero1(leia.nextDouble());
                System.out.println("Digite o segundo numero: ");
                setNumero2(leia.nextDouble());
                setMultiplicacao(getNumero1() * getNumero2());
                setResultado(getMultiplicacao());
                System.out.println(getResultado());
                break;
            case 4: /* -> DIVISÃO*/
                System.out.println("Digite o primeiro numero: ");
                setNumero1(leia.nextDouble());
                System.out.println("Digite o segundo numero: ");
                setNumero2(leia.nextDouble());
                if (getNumero1() == 0 || getNumero2() == 0){
                    System.out.println("Não é possivel dividir por 0");
                } else {
                    setDivisao(getNumero1() / getNumero2());
                }
                setResultado(getDivisao());
                System.out.println(getResultado());
                break;
            case 5: /* -> SAIR*/
                break;
            default:
                System.out.println("Operação inválida!!");
                break;
            }
        } while(escolha != 5);
    }
}
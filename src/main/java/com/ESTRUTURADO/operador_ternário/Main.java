package com.ESTRUTURADO.operador_ternário;

import java.util.Scanner;

public class Main {

    /*
        Essa classe é totalmente focada a explicar como é um operador ternário em java
        O que é um Operador Ternário em Java?
        Os operadores ternários em Java são "?" e ":", sendo utilizados para a separação de duas condições "if/else"
        ? == if -> : == else
        Sendo assim, condição ? "primeiro valor" : "segundo valor"; 
        Mais abaixo tem o exemplo prático do por que você deve OU não usar.
    */

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Atribuir valores condicionais

        int nota = leia.nextInt();
        String status = nota >= 7 ? "Aprovado" : "Reprovado";

        int maior = leia.nextInt();
        int a = leia.nextInt();
        int b = leia.nextInt();
        maior = a > b ? a : b;
        
        int numero = leia.nextInt(); 
        boolean ehPar = numero % 2 == 0 ? true : false; // pode simplificar para numero: %2 == 0

        // Passar parâmetros condicionais

        int idade = leia.nextInt();
        System.out.println(idade <= 18 ? "Adulto" : "Criança");

    }

    // RETORNAR VALORES EM METODOS  

    String mensagem;
    int idade;

    public Main() {
        this.mensagem = mensagem;
        this.idade = idade;
    }

    public String getMensagem(String mensagem) {
        return idade >= 18 ? "Maior de idade" : "Menor de idade";
    }
    /*
    
        RESUMO GERAL 
        
        Quando deve usar:

        Condições simples de uma linha
        Atribuição de variáveis
        Quando o if-else ficaria muito verboso


        Quando não deve usar:

        Condições complexas
        Vários ternários aninhados (fica ilegível)
        Quando precisa executar mais de uma instrução

        Dica dos programadores experientes:
            "Use o ternário quando a intenção fica óbvia em uma única leitura. Caso contrário, prefira o if-else."

    */
}
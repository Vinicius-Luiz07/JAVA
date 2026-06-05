package com.POO.Numeros_Primos;

import java.util.Scanner;

public class Numeros_Primos {
	
	Scanner leia = new Scanner(System.in);
	
    public static boolean verificacao_Primo(int n){
    	
    	if(n <= 1) {
    		return false; //0, 1 e numeros negativos, não são primos
    	}
    	
    	if(n == 2) {
    		return true; // 2 é o único número PAR PRIMO
    	}
    	
    	if(n %2 == 0) {
    		return false; // se for par e maior que 2, não é primo
    	}
    	
    	return true;
    }
    
    public void calculo() {
    	
    	System.out.println("Digite um numero");
    	int valor = leia.nextInt();
    	
    	if(verificacao_Primo(valor)) {
    		System.out.println(valor  + " é primo");
    	} else {
    		System.out.println(valor + " é composto");
    	}
    }
}
package com.POO.Contador_Regressivo;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class ContadorRegressivo  {
    // Método principal
    public ContadorRegressivo() {

        Timer timer = new Timer(); // cria o timer
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = leia.nextInt();

        timer.schedule(new TimerTask() {   // ← Agendando a tarefa

            int contador = valor;

            @Override
            public void run() {
                System.out.println("Contando: " + contador);
                contador--;
                
            if (contador < 0) {
                System.out.println("Timer finalizado!");
                timer.cancel();   // Parar o timer
            }
        }
    }, 0, 1000);
    }
}

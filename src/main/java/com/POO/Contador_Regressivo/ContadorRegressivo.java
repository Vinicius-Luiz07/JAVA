package com.POO.Contador_Regressivo;

import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CountDownLatch;

public class ContadorRegressivo  {
    // Método principal
    public ContadorRegressivo() {

        Timer timer = new Timer(); // cria o timer
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = leia.nextInt();

        CountDownLatch latch = new CountDownLatch(1); // trava a thread principal(switch case) é ESSENCIAL ter.

        timer.schedule(new TimerTask() {   // ← Agendando a tarefa

            int contador = valor;

            @Override
            public void run() {
                System.out.println("Contando: " + contador);
                contador--;
                if (contador < 0) {
                    System.out.println("Temporizador finalizado!");
                    timer.cancel();

                    try { // try essencial para apagar as mensagens antigas do console
                        System.out.println("Apagando logs...");
                        Thread.sleep(3000); // aguarda 3 segundos para apagar o prompt
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    clearConsole(valor); // limpa o console
                    latch.countDown(); // libera a thread principal (swith case)
                }
            }
        }, 0, 1000); // para a cada 1000 = 1 segundo

        try {
            latch.await(); // -> trave aqui até o countDown() ser chamado
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void clearConsole(int linhas) {
        // método utilizado para apagar o console
           try {
                if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

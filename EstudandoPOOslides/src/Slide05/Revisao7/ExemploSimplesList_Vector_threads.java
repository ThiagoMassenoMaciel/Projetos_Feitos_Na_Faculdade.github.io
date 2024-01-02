package Slide05.Revisao7;

import java.util.Vector;
import java.util.List;

public class ExemploSimplesList_Vector_threads {

	public static void main(String[] args) {
        // Criando uma lista de strings usando Vector
        List<String> frutas = new Vector <> ();

        // Adicionando elementos à lista
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        // Criando duas threads que acessam a lista ao mesmo tempo
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    frutas.add("Maçã");
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    frutas.add("Banana");
                }
            }
        });

        // Iniciando as threads
        thread1.start();
        thread2.start();

        // Esperando as threads terminarem
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Imprimindo a lista
        System.out.println("Lista: " + frutas);
	}

}

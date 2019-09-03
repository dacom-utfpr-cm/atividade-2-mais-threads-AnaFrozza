/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.util.Random;

/**
 *
 * @author frozza
 */
/**
 * Faça um programa multithreaded em Java que ordene um vetor usando o Merge
 * Sort recursivo Faça com que a thread principal dispare duas threads para
 * classificar cada metade do vetor.
 */
public class Main {

    public static int tamanho = 20;

    public static void main(String[] args) {
        int[] vetor = new int[tamanho];

        Random random = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = random.nextInt(50);
        }

        try {
            Threads t1 = new Threads(0, tamanho / 2, vetor);
            Threads t2 = new Threads(tamanho / 2, tamanho, vetor);

            t1.start();
            t1.join();
            t2.start();
            t2.join();
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
        }

        System.out.println("Ordenado:");
        for (int v : vetor) {
            System.out.println(v);
        }
    }
}

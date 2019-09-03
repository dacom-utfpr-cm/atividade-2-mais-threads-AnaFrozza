/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

/**
 *
 * @author frozza
 */

/**
 * Faça um programa em Java que realize uma busca paralela em um vetor de
 * inteiros Informe para o método: valor procurado, vetor de inteiros e o número
 * de threads.
 */


public class Main {
    public static int tamanho = 10;
    public static void main(String[] args) {
        int[] list = new int[tamanho];
        int valor = 20;
        int num_threads = 5;
        
        for(int i = 0; i < tamanho ; i++){
            list[i] = i;
        }
        
        for(int i = 0; i < num_threads; i++){
            Busca busca = new Busca(valor, list, num_threads);
            busca.start();
        }
    }
}

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
public class Busca extends Thread {

    int valor;
    int[] vetor;
    int num_threads;

    public Busca(int valor, int[] vetor, int num_threads) {
        this.valor = valor;
        this.vetor = vetor;
        this.num_threads = num_threads;
    }

    @Override
    public void run() {
        for (int v : vetor) {
            if (v == valor) {
                System.out.println("Valor encontrado: " + valor);
            }
        }
    }
}

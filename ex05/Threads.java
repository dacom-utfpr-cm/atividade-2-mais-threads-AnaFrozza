/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

/**
 *
 * @author frozza
 */
public class Threads extends Thread{
    int minimo;
    int maximo;
    int[] vetor;
    
    public Threads(int minimo, int maximo, int[] vetor){
        this.minimo = minimo;
        this.maximo = maximo;
        this.vetor = vetor;
    }
    
    @Override
    public void run(){
        MergeSort merge = new MergeSort();
        merge.mergeSort(vetor, minimo, maximo);
    }
}

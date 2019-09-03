/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

/**
 *
 * @author frozza
 */
public class Primo extends Thread{
    int valor = 0;
    
    public Primo(int valor){
        this.valor = valor;
    }
    
    public void run() {
        int count = 0;
        boolean isPrimo = false;
        
        if (valor != -1) {
            for (int i = 1; i <= valor; i++) {
                if (valor % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println("Numero Primo: " + valor);
                isPrimo = true;
            }
        }
        
        isPrimo = false;
    }
}

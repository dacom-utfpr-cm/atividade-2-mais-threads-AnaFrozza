/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01_ex02;

/**
 *
 * @author frozza
 */
/**
 * Faça um programa em Java que consulte periodicamente o estado de um conjunto
 * de threads.
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        try {
            ThreadGroup threads = new ThreadGroup("Grupo1");
            Thread t1 = new Thread(threads, "Thread1");
            Thread t2 = new Thread(threads, "Thread2");
            Thread t3 = new Thread(threads, "Thread3");
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();
            t3.join();

            while (true) {
                System.out.println("Estado da thread 1: " + t1.getState());
                System.out.println("Estado da thread 2: " + t2.getState());
                System.out.println("Estado da thread 3: " + t3.getState());
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
        }
    }
}

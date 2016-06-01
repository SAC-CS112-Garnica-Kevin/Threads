/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author owner
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t1 = new Thread(new Apples("one"));
        Thread t2 = new Thread(new Apples("two"));
        Thread t3 = new Thread(new Apples("three"));
        
        t1.start();
        t2.start();
        t3.start();
    }
    
}

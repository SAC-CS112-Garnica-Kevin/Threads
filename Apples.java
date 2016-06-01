/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

import java.util.Random;

/**
 *
 * @author owner
 */
public class Apples implements Runnable{
    
    String name;
    int time;
    Random r = new Random();
    
    public Apples(String s)
    {
        name = s;
        time = r.nextInt(999);
    }
    
    public void run()
    {
        try{
            System.out.printf("%s is sleep for %d\n",name, time);
            Thread.sleep(time);
            System.out.printf("%s is done\n", name);
        }catch(Exception e){}
    }
}

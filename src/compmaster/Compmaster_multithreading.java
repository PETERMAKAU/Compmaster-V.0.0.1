/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;

/**
 *
 * @author peter
 */

class MyTask extends Thread{
    @Override
    public void run(){
    for(int doc=1; doc<= 10;doc++){
      System.out.println("@@Extracting Document"+doc+" --File 2");
    
    };
    }
    
    
    }
public class Compmaster_multithreading {
    
   public static void main(String[] args)
       {
        System.out.println("=Application Started=");
        
        MyTask task =new MyTask();
        task.start();
        
        for(int doc=1; doc <=10; doc++){
          System.out.println("Printing Document #"+doc+"= Printing 1");
        }
         System.out.println("==Application Finish==");
       } 
   
}

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
/*
class MyTask extends Thread{
    @Override
    public void run(){
    for(int doc=1; doc<= 10;doc++){
      System.out.println("@@Extracting Document"+doc+" --File 2");
    
    };
    }
    
    
    }*/
class CA{

}
////////////////thread 2///////////////////////////
//class MyTask extends CA implements Runnable{
    class MyTask implements Runnable{
    @Override
    public void run(){
    for(int doc=1; doc<= 1000;doc++){
      System.out.println("@@Extracting Document"+doc+" --File 2");
    
    };
    }
    }
///////////end thread 2//////////////
////////////////thread 3///////////////////////////
class YourTask implements Runnable{
    @Override
    public void run(){
    for(int doc=1; doc<= 1000;doc++){
      System.out.println("@@Extracting Document"+doc+" --File 3");
    
    };
    }
    }
///////////end thread 3//////////////
public class Compmaster_multithreading {
    
   public static void main(String[] args)
       {
        System.out.println("=Application Started=");
        
      //  MyTask task =new MyTask();
       // task.start();
        ///////////call Thread 2///////////////
       /* Runnable r = new MyTask();
        Thread task = new Thread(r);
        task.start();*/
        
          ////////////end call Thread 2///////////
        new Thread(new MyTask()).start();
        /////////////call Thread 3//////////////
        ////////////end call Thread 2///////////
        new Thread(new YourTask()).start();
        /////////////call Thread 3//////////////
        
        for(int doc=1; doc <=10; doc++){
          System.out.println("Printing Document #"+doc+"= Printing 1");
        }
         System.out.println("==Application Finish==");
       } 
   
}

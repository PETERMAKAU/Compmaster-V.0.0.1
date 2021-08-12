/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomeClasses;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author peter
 */
class Printer{
 synchronized void printDocuments(int numOfCopies, String docName){
     
  for(int i=1; i<=numOfCopies; i++){
      System.out.println(">> Printer"+docName+" "+i);
  }
  
 }
}
class MyThread extends Thread{
    Printer pRef;
    MyThread(Printer p){
    pRef=p;
    }
    
    @Override
    public void run(){
        
        synchronized(pRef){
         pRef.printDocuments(10, "A.Arc");
        }
   
    }

}

class YourThread extends Thread{
    Printer pRef;
    YourThread(Printer p){
    pRef=p;
    }
    
    @Override
    public void run(){
    pRef.printDocuments(10, "B.Arc");
    }

}
public class SyncThread {
    
    public static void main(String[] args){
        System.out.println("--Application Started--");
        Printer printer = new Printer();
        MyThread mRef = new MyThread(printer);
        YourThread yRef = new YourThread(printer);
        mRef.start();
       /* try {
            mRef.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(SyncThread.class.getName()).log(Level.SEVERE, null, ex);
        }*/
         yRef.start();
        System.out.println("--Application Finished--");
    }
    
}

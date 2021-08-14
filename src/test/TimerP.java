/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.TimerTask;
import java.util.Timer;
/**
 *
 * @author peter
 */

public class TimerP{
    
    int secondsPassed=0;
    TimerP myTimer = new TimerP();
    TimerTask task = new TimerTask(){    
    public void run(){
      secondsPassed++;
      System.out.println("Second Passed:" +secondsPassed );
    }            
     };
    
}

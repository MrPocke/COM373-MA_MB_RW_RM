/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com373;

import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author B00731185
 */
public class COM373 
{
    public static int Mounth = 1;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        TimerTask repeatedTask = new TimerTask()
        {
            public void run()
            {
                
                //the monthly random deposits and withdrawals should rely on the Mounth variable changing NOT the actual Value of the Mounth variable 
                do
                {
                   while(Mounth <= 12)
                    {
                    Mounth++;                 
                    }
                    Mounth = 1; 
                }
                //link this to exit button NOT being clicked
                
            }
        };
        long delay  = 5000;
        long period = 0;
        Timer timer = new Timer("Timer");
        timer.scheduleAtFixedRate(repeatedTask, delay, period);
        // TODO code application logic here    
    }
}

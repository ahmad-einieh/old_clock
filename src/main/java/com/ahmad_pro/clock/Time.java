/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ahmad_pro.clock;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.concurrent.ThreadLocalRandom;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ahmad
 */
public class Time {
    Calendar calendar;
    SimpleDateFormat timeFormat;
    String packegTime;
    
    
    
        public void setTime(){
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
        while(true){
        packegTime = timeFormat.format(calendar.getInstance().getTime());
        clockGUI.time.setText(packegTime);
        Color[] colors = {Color.red,Color.black,Color.blue,Color.green};
        
        int randomNum = ThreadLocalRandom.current().nextInt(0, 3);
        
        
       clockGUI.time.setForeground(colors[randomNum]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(clockGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    
    }

    
}

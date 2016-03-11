/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;
import java.io.IOException;
import javax.microedition.lcdui.*;

/**
 *
 * @author Bacem
 */
public class Spinner extends Canvas implements Runnable {

    Image img[]=new Image[50];
    int index =0;
    int iteration =0;
    public Spinner() {
        String s="";
        for(int i=0; i<50; i++){
            s = "/com/gui/images/spinner/"+i+".png";
            try {
                img[i]=Image.createImage(s);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            
        }
        Thread th=new Thread(this);
        th.start();
         
    }

    public void run() {
        int x=-1;
        boolean wsel = false;
        while(true) {
            if(index==49){
                wsel = true;
            }
            if (index==0){
                wsel = false;
            }
            if(wsel){
                index--;
            }
            else{
                index++;
            }
            repaint();
            try {
                Thread.sleep(20);
            }catch(Exception e){}
        }
    }

    protected void paint(Graphics g) {
        g.drawImage(img[index],getWidth()/2,getHeight()/2,g.VCENTER|g.HCENTER);
        iteration++;
        if (iteration%320==0){
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesseract;

import com.entities.Apprenant;
import com.gui.Animation;
import javax.microedition.lcdui.*;
import javax.microedition.midlet.*;

/**
 * @author Bob
 */
public class Midlet extends MIDlet {

    public Display disp = Display.getDisplay(this);
    public Apprenant ApprenantCurrent;
    
    public static Midlet INSTANCE = null;
    public void startApp() {
        INSTANCE = this;
        disp.setCurrent(new Animation());
    }
    
    public void pauseApp() {
    }
    
    public void destroyApp(boolean unconditional) {
    }
}

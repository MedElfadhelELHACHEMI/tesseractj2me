/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gui;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

/**
 *
 * @author BoB
 */
public class OrganisationMenu extends Canvas {
    int w = getWidth();
    int h = getHeight();

    protected void paint(Graphics g) {
        g.setColor(255,255,255);
        g.fillRect(0, 0, w, h);
    }
    public OrganisationMenu(){}
}

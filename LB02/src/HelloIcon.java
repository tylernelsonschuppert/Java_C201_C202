/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tylernelson
 */

import javax.swing.*;
public class HelloIcon {
    // Attributes
    
    // Constructors
    
    // Methods
    
    public static void main(String[] args)
    {
        JFrame myWin;
        myWin = new JFrame("Tyler Nelson's Hello");
        JLabel myLab;
        myLab = new JLabel ("Hello, computer, this is Tyler Nelson!");
        ImageIcon myIcn;
        myIcn = new ImageIcon("duck.gif");
        
        myLab.setIcon(myIcn);
        myWin.add(myLab);
        myWin.setSize(400,200);
        myWin.setVisible(true);
    }
}
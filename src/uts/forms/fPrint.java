/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import uts.ListBooked;
import uts.ListUnbooked;
/**
 *
 * @author Kyroline
 */
public class fPrint extends Frame implements ActionListener {
    List liData;
    Button bPrintFirst, bPrintAt, bPrintLast;
    ListBooked listBooked;
    ListUnbooked listUnbooked;
    public fPrint (/*ListBooked listBooked, ListUnbooked listUnbooked*/) {
        this.listBooked = listBooked;
        this.listUnbooked = listUnbooked;
        liData = new List();
        liData.setBounds(50, 50, 540, 200);
        bPrintFirst = new Button("Print Dari Depan");
        bPrintFirst.setBounds(50, 300, 160, 50);
        add(bPrintFirst);
        bPrintAt = new Button("Cari Data");
        bPrintAt.setBounds(240, 300, 160, 50);
        add(bPrintAt);
        bPrintLast = new Button("Print Dari Belakang");
        bPrintLast.setBounds(430, 300, 160, 50);
        add(bPrintLast);
        add(liData);
        setTitle("Melihat Data Pemesan");
        setSize(640, 480);
        setLayout(null);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*public static void main(String[] args) {
        fPrint f = new fPrint();
        f.setVisible(true);
        
    }*/
    
}
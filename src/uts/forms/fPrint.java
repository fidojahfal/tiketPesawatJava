/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import uts.ListBooked;
import uts.ElementBooked;
import uts.ListUnbooked;
/**
 *
 * @author Kyroline
 */
public class fPrint extends Frame implements ActionListener {
    List liData;
    Button bPrintFirst, bPrintAt, bPrintLast;
    ListUnbooked listUnbooked;
    ListBooked listBooked;
    public fPrint (ListUnbooked listUnbooked, ListBooked listBooked) {
        this.listUnbooked = listUnbooked;
        this.listBooked = listBooked;
        this.setResizable(false);
        //this.listUnbooked = listUnbooked;
        
        
        
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
        bPrintFirst.addActionListener(this);
        bPrintLast.addActionListener(this);
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bPrintFirst) {
            ElementBooked pointer = listBooked.first;
            if (listBooked.first == null) {
                System.out.println("LINKED LIST KOSONG");
            } else {
                while (pointer != null) {
                    liData.add(pointer.data.id + " " + pointer.data.nama + " " + pointer.data.jadwal + " " + pointer.data.kelas + " " + pointer.data.kursi);
                    pointer = pointer.next;
                }
            }
        } else if (e.getSource() == bPrintLast) {
            ElementBooked pointer = listBooked.last;
            if (listBooked.last == null) {
                System.out.println("LINKED LIST KOSONG");
            } else {
                while (pointer != null) {
                    liData.add(pointer.data.id + " " + pointer.data.nama + " " + pointer.data.jadwal + " " + pointer.data.kelas + " " + pointer.data.kursi);
                    pointer = pointer.prev;
                }
            }
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*public static void main(String[] args) {
        fPrint f = new fPrint();
        f.setVisible(true);
        
    }*/
    
}

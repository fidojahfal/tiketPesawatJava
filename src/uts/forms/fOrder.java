/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts.forms;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import uts.ListBooked;
/**
 *
 * @author Kyroline
 */
public class fOrder extends Frame implements ActionListener {
    Label lJadwal, lKelas, lSeat, lNama, lHarga; 
    List liJadwal, liKelas, liSeat;
    Button bOrder;
    JTextField tbNama;
    JComboBox cbJadwal, cbKelas, cbKursi;
    ListBooked bookedList;
    public fOrder(ListBooked bookedList) {
        this.bookedList = bookedList;
        lJadwal = new Label("Jadwal Penerbangan");
        lJadwal.setBounds(50, 300, 150, 20);
        add(lJadwal);
        String[] jadwal = {"Jam 7.00", "Jam 12.00", "Jam 15.00"};
        cbJadwal = new JComboBox(jadwal);
        cbJadwal.setBounds(200, 300, 100, 20);
        add(cbJadwal);
        lKelas = new Label("Kelas");
        lKelas.setBounds(300, 300, 50, 20);
        add(lKelas);
        String[] kelas = {"Ekonomi", "Bisnis", "First Class"};
        cbKelas = new JComboBox(kelas);
        cbKelas.setBounds(350, 300, 100, 20);
        add(cbKelas);
        lSeat = new Label("Nomor Kursi");
        lSeat.setBounds(450, 300, 100, 20);
        add(lSeat);
        cbKursi = new JComboBox();
        cbKursi.setBounds(550, 300, 50, 20);
        add(cbKursi);
        lNama = new Label("Nama");
        lNama.setBounds(50, 330, 50, 20);
        add(lNama);
        tbNama = new JTextField();
        tbNama.setBounds(100, 330, 300, 20);
        add(tbNama);
        lHarga = new Label("Harga");
        lHarga.setBounds(420, 330, 500, 20);
        add(lHarga);
        bOrder = new Button("Pesan");
        bOrder.setBounds(100, 360, 440, 30);
        add(bOrder);
        bOrder.addActionListener(this);
        setTitle("Pemesanan Tiket Pesawat");
        setSize(640, 480);
        setLayout(null);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bOrder) {
            fPrint submit = new fPrint(bookedList);
            submit.setVisible(true);
            lHarga.setText("Harga Rp100.000,-");
        }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    /*public static void main(String[] args) {
        fOrder f = new fOrder();
        f.setVisible(true);
    }*/
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts.forms.fPrint;

import uts.*;

/**
 *
 * @author Admin
 */
public class fFind extends javax.swing.JFrame {

    /**
     * Creates new form jCheck
     */
    java.awt.List liTiket;
    ListUnbooked unbookedList;
    ListBooked bookedList;

    public fFind(java.awt.List liTiket, ListUnbooked unbookedList, ListBooked bookedList) {
        this.liTiket = liTiket;
        this.unbookedList = unbookedList;
        this.bookedList = bookedList;
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbNama = new javax.swing.JTextField();
        bCari = new javax.swing.JButton();
        lCari = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tbID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bCari.setText("Cari");
        bCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCariActionPerformed(evt);
            }
        });

        lCari.setText("Masukkan Nama");

        jLabel1.setText("Masukkan ID");

        tbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCari)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tbID, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tbNama, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bCari)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCari)
                    .addComponent(tbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bCari)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCariActionPerformed
        if (tbID.getText().equals("") || tbNama.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Harap masukkan data id dan nama terlebih dahulu!");
        } else if (bookedList.first == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Daftar Tiket Pemesan Kosong!");
        } else {
            liTiket.removeAll();
            ElementBooked pointer = bookedList.first;
            if (bookedList.first == null) {

            } else {
                int i = 1;
                boolean exist = false;
                liTiket.add("------- Hasil Pencarian --------");
                while (pointer != null && i <= 324) {
                    if (pointer.data.nama.equals(tbNama.getText()) && pointer.data.id.equals(tbID.getText())) {
                        //liTiket.addItem("");
                        addItem(pointer, i);
                        exist = true;
                    }
                    pointer = pointer.next;
                }
                if (!exist) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Data tidak ditemukan!");
                }
                liTiket.add("--------- End List ---------");
            }
        }
        tbID.setText("");
        tbNama.setText("");
    }//GEN-LAST:event_bCariActionPerformed

    private void addItem(ElementBooked pointer, int i) {
        if (pointer.prev != null) {
            liTiket.add("-------------" + i + "------------\n");
            liTiket.add("Id : " + pointer.prev.data.id);
            liTiket.add("Nama : " + pointer.prev.data.nama);
            liTiket.add("Jadwal : " + pointer.prev.data.jadwal);
            liTiket.add("Kelas : " + pointer.prev.data.kelas);
            liTiket.add("\nKursi : " + pointer.prev.data.kursi);
            i++;
        }
        
        liTiket.add("-------------" + i + "------------\n");
        liTiket.add("Id : " + pointer.data.id);
        liTiket.add("Nama : " + pointer.data.nama);
        liTiket.add("Jadwal : " + pointer.data.jadwal);
        liTiket.add("Kelas : " + pointer.data.kelas);
        liTiket.add("\nKursi : " + pointer.data.kursi);
        i++;
        if (pointer.next != null) {
            liTiket.add("-------------" + i + "------------\n");
            liTiket.add("Id : " + pointer.next.data.id);
            liTiket.add("Nama : " + pointer.next.data.nama);
            liTiket.add("Jadwal : " + pointer.next.data.jadwal);
            liTiket.add("Kelas : " + pointer.next.data.kelas);
            liTiket.add("\nKursi : " + pointer.next.data.kursi);
        }
    }
    private void tbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIDActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(fFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(fFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(fFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(fFind.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new fFind().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lCari;
    private javax.swing.JTextField tbID;
    private javax.swing.JTextField tbNama;
    // End of variables declaration//GEN-END:variables
}

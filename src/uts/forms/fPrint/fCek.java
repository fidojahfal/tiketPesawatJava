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
public class fCek extends javax.swing.JFrame {

    /**
     * Creates new form fCek
     */
    ListUnbooked unbookedList;
    ListBooked bookedList;

    public fCek(ListUnbooked unbookedList, ListBooked bookedList) {
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

        bPrintLast = new javax.swing.JButton();
        bPrintAt = new javax.swing.JButton();
        bPrintFirst = new javax.swing.JButton();
        lTitle = new javax.swing.JLabel();
        liTiket = new java.awt.List();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bPrintLast.setText("Tampilkan Dari Belakang");
        bPrintLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintLastActionPerformed(evt);
            }
        });

        bPrintAt.setText("Cari Data");
        bPrintAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintAtActionPerformed(evt);
            }
        });

        bPrintFirst.setText("Tampilkan Dari Depan");
        bPrintFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintFirstActionPerformed(evt);
            }
        });

        lTitle.setText("Cek Data Pemesan Tiket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(liTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bPrintFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(bPrintAt, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(bPrintLast, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(243, 243, 243)
                .addComponent(lTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(liTiket, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bPrintAt, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrintLast, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPrintFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPrintFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintFirstActionPerformed
        liTiket.removeAll();
        ElementBooked pointer = bookedList.first;
        if (bookedList.first == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Daftar Tiket Pemesan Kosong!");
        } else {
            liTiket.add("------- Hasil Pencarian --------");
            int i = 1;
            while (pointer != null && i <= 324) {
                liTiket.add("-------------" + i + "------------\n");
                liTiket.add("Id : " + pointer.data.id);
                liTiket.add("Nama : " + pointer.data.nama);
                liTiket.add("Jadwal : " + pointer.data.jadwal);
                liTiket.add("Kursi : " + pointer.data.kelas);
                liTiket.add("\nKelas : " + pointer.data.kursi);

                pointer = pointer.next;
                i++;
            }
            liTiket.add("--------- End List ---------");
        }
    }//GEN-LAST:event_bPrintFirstActionPerformed

    private void bPrintAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintAtActionPerformed
        if (unbookedList.first == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Daftar Tiket Pemesan Kosong!");
        } else {
            fFind cariData = new fFind(liTiket, unbookedList, bookedList);
            cariData.setResizable(false);
            cariData.setVisible(true);
        }
    }//GEN-LAST:event_bPrintAtActionPerformed

    private void bPrintLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintLastActionPerformed
        // TODO add your handling code here:
        liTiket.removeAll();
        ElementUnbooked pointer = unbookedList.first;
        if (unbookedList.first == null) {
            javax.swing.JOptionPane.showMessageDialog(null, "Daftar Tiket Pemesan Kosong!");
        } else {
            liTiket.add("------- Hasil Pencarian --------");
            int i = 1;
            while (pointer != null && i <= 324) {
                liTiket.add("-------------" + i + "------------\n");
                liTiket.add("Id : " + pointer.data.id);
                liTiket.add("Nama : " + pointer.data.nama);
                liTiket.add("Jadwal : " + pointer.data.jadwal);
                liTiket.add("Kursi : " + pointer.data.kelas);
                liTiket.add("\nKelas : " + pointer.data.kursi);

                pointer = pointer.next;
                i++;
            }
            liTiket.add("--------- End List ---------");
        }
    }//GEN-LAST:event_bPrintLastActionPerformed

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
//            java.util.logging.Logger.getLogger(fCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(fCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(fCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(fCek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new fCek().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bPrintAt;
    private javax.swing.JButton bPrintFirst;
    private javax.swing.JButton bPrintLast;
    private javax.swing.JLabel lTitle;
    private java.awt.List liTiket;
    // End of variables declaration//GEN-END:variables
}

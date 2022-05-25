/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fDelete;

import uts.*;

/**
 *
 * @author Kargo
 */
public class fMenuBatal extends javax.swing.JFrame {

    ListUnbooked unbookedList;
    ListBooked bookedList;

    /**
     * Creates new form fMenuBatal
     */
    public fMenuBatal(ListUnbooked unbookedList, ListBooked bookedList) {
        this.unbookedList = unbookedList;
        this.bookedList = bookedList;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bDeleteFirst = new javax.swing.JButton();
        bDeleteAt = new javax.swing.JButton();
        bDeleteLast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bDeleteFirst.setText("Delete First");
        bDeleteFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteFirstActionPerformed(evt);
            }
        });

        bDeleteAt.setText("Delete At");
        bDeleteAt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteAtActionPerformed(evt);
            }
        });

        bDeleteLast.setText("Delete Last");
        bDeleteLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteLastActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Menu Pembatalan Tiket Pesawat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bDeleteFirst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDeleteAt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bDeleteLast, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addComponent(bDeleteFirst)
                .addGap(34, 34, 34)
                .addComponent(bDeleteAt)
                .addGap(39, 39, 39)
                .addComponent(bDeleteLast)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bDeleteAtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteAtActionPerformed
        // TODO add your handling code here:
        fBatal f = new fBatal(unbookedList, bookedList);
        f.setVisible(true);
        f.setResizable(false);
    }//GEN-LAST:event_bDeleteAtActionPerformed

    private void bDeleteFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteFirstActionPerformed
        // TODO add your handling code here:
        bookedList.deleteFirst();
    }//GEN-LAST:event_bDeleteFirstActionPerformed

    private void bDeleteLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteLastActionPerformed
        // TODO add your handling code here:
        bookedList.deleteLast();
    }//GEN-LAST:event_bDeleteLastActionPerformed

//    /**
//     * @param args the command line arguments
//     */
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
//            java.util.logging.Logger.getLogger(fMenuBatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(fMenuBatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(fMenuBatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(fMenuBatal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new fMenuBatal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDeleteAt;
    private javax.swing.JButton bDeleteFirst;
    private javax.swing.JButton bDeleteLast;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

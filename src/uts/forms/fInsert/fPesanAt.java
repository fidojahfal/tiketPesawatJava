/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package uts.forms.fInsert;

import static uts.forms.fInsert.fPesan.getAlphaNumericString;
import uts.ElementBooked;
import uts.ListBooked;
import uts.ListUnbooked;

/**
 *
 * @author Admin
 */
public class fPesanAt extends javax.swing.JFrame {

    /**
     * Creates new form fPesanAt
     */
    javax.swing.JComboBox<String> cbJadwal;
    javax.swing.JComboBox<String> cbKelas;
    javax.swing.JComboBox<String> cbKursi;
    javax.swing.JCheckBox cSure;
    javax.swing.JTextField tbNama1;
    ListUnbooked unbookedList;
    ListBooked bookedList;

    public fPesanAt(javax.swing.JTextField tbNama1, javax.swing.JComboBox<String> cbJadwal, javax.swing.JComboBox<String> cbKelas,
            javax.swing.JComboBox<String> cbKursi, javax.swing.JCheckBox cSure,ListUnbooked unbookedList, ListBooked bookedList) {
        this.tbNama1 = tbNama1;
        this.cbJadwal = cbJadwal;
        this.cbKelas = cbKelas;
        this.cbKursi = cbKursi;
        this.cSure = cSure;
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

        lCari = new javax.swing.JLabel();
        tbNama = new javax.swing.JTextField();
        tbID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lCari.setText("Masukkan Nama");

        tbID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbIDActionPerformed(evt);
            }
        });

        jLabel1.setText("Masukkan ID");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tbID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCari)
                    .addComponent(tbNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tbID.getText().equals("") || tbNama.getText().equals("")) {
            javax.swing.JOptionPane.showMessageDialog(null, "Harap masukkan data id dan nama terlebih dahulu!");
        } else {
            String id = null;
            if (cbKelas.getSelectedItem() == "Ekonomi") {
                id = "EK";
            } else if (cbKelas.getSelectedItem() == "Bisnis") {
                id = "BI";
            } else if (cbKelas.getSelectedItem() == "First Class") {
                id = "FC";
            }
            if (bookedList.first == null) {
                id = id + getAlphaNumericString(4);
            } else {
                boolean valid = false;
                String idTemp;
                do {
                    ElementBooked pointer = bookedList.first;
                    idTemp = id + getAlphaNumericString(4);
                    while (pointer != null) {
                        if (pointer.data.id.equals(idTemp)) {
                            //cbKursi.addItem(pointer.data.kursi);
                            valid = true;
                            id = idTemp;
                            break;
                        }
                        if (pointer.next == null && !(pointer.data.id.equals(idTemp))) {
                            valid = false;
                            break;
                        }
                        pointer = pointer.next;
                    }
                } while (valid);
                id = idTemp;
            }
            ElementBooked pointer = bookedList.first;
            if (bookedList.first == null) {
                javax.swing.JOptionPane.showMessageDialog(null, "List Masih Kosong!");
                this.dispose();
            } else {
                while (pointer != null) {
                    if (pointer.data.nama.equals(tbNama.getText()) && pointer.data.id.equals(tbID.getText())) {
                        //liTiket.addItem("");
                        bookedList.insertAt(tbID.getText(), tbNama.getText(), id, tbNama1.getText(), (String) cbJadwal.getSelectedItem(),
                                (String) cbKursi.getSelectedItem(), (String) cbKelas.getSelectedItem());
                        unbookedList.insertAt(id, tbNama1.getText(), (String) cbJadwal.getSelectedItem(),
                                (String) cbKursi.getSelectedItem(), (String) cbKelas.getSelectedItem());
                        tbNama1.setText("");
                        cbJadwal.setSelectedIndex(0);
                        cbKelas.setSelectedIndex(0);
                        cSure.setSelected(false);
                        javax.swing.JOptionPane.showMessageDialog(null, "Tiket Berhasil Dipesan dengan ID : " + id);
                        this.dispose();
                    }
                    pointer = pointer.next;
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
//            java.util.logging.Logger.getLogger(fPesanAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(fPesanAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(fPesanAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(fPesanAt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new fPesanAt().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lCari;
    private javax.swing.JTextField tbID;
    private javax.swing.JTextField tbNama;
    // End of variables declaration//GEN-END:variables
}

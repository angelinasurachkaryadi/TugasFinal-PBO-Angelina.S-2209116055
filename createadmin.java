/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bioskop.main;

/**
 *
 * @author Lenovo
 */
public class createadmin extends javax.swing.JFrame {

    /**
     * Creates new form createadmin
     */
    public createadmin() {
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

        jButtonCREATE = new javax.swing.JButton();
        Minimize = new javax.swing.JLabel();
        CLOSE = new javax.swing.JLabel();
        TIKET = new javax.swing.JButton();
        JADWALTAYANG = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jButtonCREATE.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCREATE.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jButtonCREATE.setForeground(new java.awt.Color(204, 0, 0));
        jButtonCREATE.setText("CREATE");
        jButtonCREATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCREATEMouseClicked(evt);
            }
        });
        jButtonCREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCREATEActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        Minimize.setBackground(new java.awt.Color(255, 0, 0));
        Minimize.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        Minimize.setForeground(new java.awt.Color(204, 0, 0));
        Minimize.setText("-");
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
        });
        getContentPane().add(Minimize);
        Minimize.setBounds(350, 0, 11, 40);

        CLOSE.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(204, 0, 0));
        CLOSE.setText("X");
        getContentPane().add(CLOSE);
        CLOSE.setBounds(370, 0, 23, 40);

        TIKET.setBackground(new java.awt.Color(0, 0, 0));
        TIKET.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        TIKET.setForeground(new java.awt.Color(204, 0, 0));
        TIKET.setText("TIKET");
        TIKET.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TIKETMouseClicked(evt);
            }
        });
        TIKET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TIKETActionPerformed(evt);
            }
        });
        getContentPane().add(TIKET);
        TIKET.setBounds(140, 340, 120, 50);

        JADWALTAYANG.setBackground(new java.awt.Color(0, 0, 0));
        JADWALTAYANG.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        JADWALTAYANG.setForeground(new java.awt.Color(204, 0, 0));
        JADWALTAYANG.setText("JADWAL TAYANG");
        JADWALTAYANG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JADWALTAYANGMouseClicked(evt);
            }
        });
        JADWALTAYANG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JADWALTAYANGActionPerformed(evt);
            }
        });
        getContentPane().add(JADWALTAYANG);
        JADWALTAYANG.setBounds(90, 260, 220, 50);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("choose option :");
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 180, 140, 28);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bioskop/main/Desain tanpa judul.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 400, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        // TODO add your handling code here:
        // to minimize the window
        this.setState(1);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void jButtonCREATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCREATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCREATEMouseClicked

    private void jButtonCREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCREATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCREATEActionPerformed

    private void TIKETMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TIKETMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TIKETMouseClicked

    private void TIKETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TIKETActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TIKETActionPerformed

    private void JADWALTAYANGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JADWALTAYANGMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JADWALTAYANGMouseClicked

    private void JADWALTAYANGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JADWALTAYANGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JADWALTAYANGActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(createadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOSE;
    private javax.swing.JButton JADWALTAYANG;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton TIKET;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCREATE;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bioskop.main;

/**
 *
 * @author Lenovo
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
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

        CLOSE = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        READ = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        CREATE = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        CLOSE.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        CLOSE.setForeground(new java.awt.Color(204, 0, 0));
        CLOSE.setText("X");
        getContentPane().add(CLOSE);
        CLOSE.setBounds(370, 0, 23, 40);

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

        READ.setBackground(new java.awt.Color(0, 0, 0));
        READ.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        READ.setForeground(new java.awt.Color(204, 0, 0));
        READ.setText("READ");
        READ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                READMouseClicked(evt);
            }
        });
        getContentPane().add(READ);
        READ.setBounds(240, 310, 120, 50);

        DELETE.setBackground(new java.awt.Color(0, 0, 0));
        DELETE.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        DELETE.setForeground(new java.awt.Color(204, 0, 0));
        DELETE.setText("DELETE");
        DELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DELETEMouseClicked(evt);
            }
        });
        getContentPane().add(DELETE);
        DELETE.setBounds(240, 430, 120, 50);

        UPDATE.setBackground(new java.awt.Color(0, 0, 0));
        UPDATE.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        UPDATE.setForeground(new java.awt.Color(204, 0, 0));
        UPDATE.setText("UPDATE");
        UPDATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UPDATEMouseClicked(evt);
            }
        });
        getContentPane().add(UPDATE);
        UPDATE.setBounds(40, 430, 120, 50);

        CREATE.setBackground(new java.awt.Color(0, 0, 0));
        CREATE.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        CREATE.setForeground(new java.awt.Color(204, 0, 0));
        CREATE.setText("CREATE");
        CREATE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CREATEMouseClicked(evt);
            }
        });
        CREATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CREATEActionPerformed(evt);
            }
        });
        getContentPane().add(CREATE);
        CREATE.setBounds(40, 310, 120, 50);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 0, 0));
        jButton1.setText("MENU ADMIN");
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 90, 250, 70);

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 0));
        jButton2.setText("choose option :");
        getContentPane().add(jButton2);
        jButton2.setBounds(130, 250, 140, 28);

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

    private void READMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_READMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_READMouseClicked

    private void DELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DELETEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_DELETEMouseClicked

    private void UPDATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UPDATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_UPDATEMouseClicked

    private void CREATEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CREATEMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CREATEMouseClicked

    private void CREATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CREATEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CREATEActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CLOSE;
    private javax.swing.JButton CREATE;
    private javax.swing.JButton DELETE;
    private javax.swing.JLabel Minimize;
    private javax.swing.JButton READ;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

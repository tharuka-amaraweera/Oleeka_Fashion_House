/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Dell
 */
public class admin_inventory extends javax.swing.JFrame {

    /**
     * Creates new form admin_inventory
     */
    public admin_inventory() {
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

        jPanel29 = new javax.swing.JPanel();
        jButton29 = new javax.swing.JButton();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        j8 = new javax.swing.JDesktopPane();
        jButton34 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel29.setBackground(new java.awt.Color(51, 0, 153));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton29.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton29.setForeground(new java.awt.Color(102, 153, 255));
        jButton29.setText("LOG OUT");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 100, -1, -1));

        jPanel30.setBackground(new java.awt.Color(0, 51, 102));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(0, 51, 51));
        jPanel30.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 190, 40));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Desktop\\project\\SUPPLIER.png")); // NOI18N
        jPanel30.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, 120));

        jButton30.setText("Reports");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 200, -1));

        jButton31.setText("Inventory list");
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, -1));

        jButton32.setText("Stock reconciliation");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 200, -1));

        jButton33.setText("Selling prices");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel30.add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, -1));
        jPanel30.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 200, 10));

        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel30.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 70, 50));

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Dell\\Downloads\\icons8-notification-24.png")); // NOI18N
        jPanel30.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 60, 130));

        jPanel29.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 50, 230, 770));

        jPanel32.setBackground(new java.awt.Color(0, 51, 102));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");
        jPanel32.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));
        jPanel32.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 70, 40));

        jLabel6.setAlignmentY(0.0F);
        jPanel32.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 10, 50, 20));
        jPanel32.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, 60, 20));

        jPanel29.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 40));

        jPanel33.setBackground(new java.awt.Color(255, 102, 51));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INVENTORY");
        jPanel33.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 150, 40));

        jPanel29.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1200, -1));
        jPanel29.add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 990, 670));

        jButton34.setBackground(new java.awt.Color(153, 204, 255));
        jButton34.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jButton34.setForeground(new java.awt.Color(153, 153, 255));
        jButton34.setText("BACK");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel29.add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/icons8-notification-24.png"))); // NOI18N
        jPanel29.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 100, 40, 30));

        getContentPane().add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        admin_panel ap1=new admin_panel();
        ap1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        admin_panel ao1=new admin_panel();
        ao1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
         j8.removeAll();
     inventory_list m6=new inventory_list();
        j8.add(m6).setVisible(true);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        j8.removeAll();
     selling_price m5=new selling_price();
        j8.add(m5).setVisible(true);
    }//GEN-LAST:event_jButton33ActionPerformed

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
            java.util.logging.Logger.getLogger(admin_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_inventory().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane j8;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}

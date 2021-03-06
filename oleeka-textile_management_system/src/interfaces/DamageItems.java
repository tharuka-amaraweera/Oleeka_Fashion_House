/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.swing.JFrame;

/**
 *
 * @author prabhavi
 */
public class DamageItems extends javax.swing.JFrame {

    /**
     * Creates new form DamageItems
     */
    public DamageItems() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Stock = new javax.swing.JButton();
        Showroom = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(22, 63, 130));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(20, 41, 77));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        jPanel2.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 70, 20));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, -1, 20));

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, -1, -1));
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.circle.growth.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 40));

        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.chevron.down.png"))); // NOI18N
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel2.add(minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 10, 60, 20));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.close.png"))); // NOI18N
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 60, 20));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        jPanel3.setBackground(new java.awt.Color(20, 41, 77));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/rsz_4.png"))); // NOI18N
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 140, 150));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/appbar.arrow.left.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        jPanel4.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 50, 20));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 190, 430));

        jPanel5.setBackground(new java.awt.Color(255, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Damage Items");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 160, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 810, 40));

        Stock.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        Stock.setText("Stock");
        Stock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockActionPerformed(evt);
            }
        });
        jPanel1.add(Stock, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 160, 40));

        Showroom.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        Showroom.setText("ShowRoom");
        Showroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowroomActionPerformed(evt);
            }
        });
        jPanel1.add(Showroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 160, 40));

        jPanel6.setBackground(new java.awt.Color(0, 153, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/warehouse2.jpg"))); // NOI18N
        jPanel6.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 160, 80));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 160, 100));

        jPanel7.setBackground(new java.awt.Color(0, 153, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/interfaces/stock1.jpg"))); // NOI18N
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 10, 200, 80));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 160, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockActionPerformed
       StockDamage s1= new StockDamage();
       s1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_StockActionPerformed

    private void ShowroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowroomActionPerformed
       ShowRoomDamage w1= new ShowRoomDamage();
       w1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ShowroomActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
       Maintenance m1= new Maintenance();
       m1.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
      setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

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
            java.util.logging.Logger.getLogger(DamageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DamageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DamageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DamageItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DamageItems().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Showroom;
    private javax.swing.JButton Stock;
    private javax.swing.JLabel back;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel minimize;
    // End of variables declaration//GEN-END:variables
}

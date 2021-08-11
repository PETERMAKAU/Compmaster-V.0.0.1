/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compmaster;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author peter
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        setIcon();
    }
  public void close(){
        
WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbl_8 = new javax.swing.JLabel();
        lbl_7 = new javax.swing.JLabel();
        lbl_3 = new javax.swing.JLabel();
        lbl_6 = new javax.swing.JLabel();
        lbl_5 = new javax.swing.JLabel();
        lbl_4 = new javax.swing.JLabel();
        lbl_2 = new javax.swing.JLabel();
        lbl_1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Compmaster Version 1.0.0");
        setAlwaysOnTop(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(40, 40, 40));
        jPanel2.setToolTipText("");
        jPanel2.setPreferredSize(new java.awt.Dimension(610, 390));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(40, 40, 40));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon4.png"))); // NOI18N
        jPanel1.add(lbl_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 60, 60));

        lbl_7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon8.png"))); // NOI18N
        jPanel1.add(lbl_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 60, 60));

        lbl_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon3.png"))); // NOI18N
        jPanel1.add(lbl_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, 60));

        lbl_6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon7.png"))); // NOI18N
        jPanel1.add(lbl_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 60));

        lbl_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon6.png"))); // NOI18N
        jPanel1.add(lbl_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, 60));

        lbl_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon5.png"))); // NOI18N
        jPanel1.add(lbl_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 60, 60));

        lbl_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon2.png"))); // NOI18N
        jPanel1.add(lbl_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 60, 60));

        lbl_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/import_icon.png"))); // NOI18N
        lbl_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_1MouseClicked(evt);
            }
        });
        jPanel1.add(lbl_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 60, 60));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel3.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 60, 60));

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 60, 60));

        jLabel5.setBackground(new java.awt.Color(153, 153, 153));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 60, 60));

        jLabel6.setBackground(new java.awt.Color(153, 153, 153));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel6.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 60, 60));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 60, 60));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 60, 60));

        jLabel7.setBackground(new java.awt.Color(153, 153, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 60, 60));

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/button60x60.png"))); // NOI18N
        jLabel8.setPreferredSize(new java.awt.Dimension(82, 82));
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 60, 60));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 43, 97, 36));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 9, 590, 370));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 610, 390));

        setSize(new java.awt.Dimension(615, 418));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_1MouseClicked
        // TODO add your handling code here
         close();//
        HomepageWindow print = new HomepageWindow();
        print.setVisible(true);
        
    }//GEN-LAST:event_lbl_1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws Exception {
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
            java.util.logging.Logger.getLogger(Jtatto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Jtatto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Jtatto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Jtatto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                 //UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
                    UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
                    // UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
                     
                    /// UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
                  //UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
                    //UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
                   // UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnsupportedLookAndFeelException ex) {
                    Logger.getLogger(MainWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
        //new Test_Jtatto();
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_1;
    private javax.swing.JLabel lbl_2;
    private javax.swing.JLabel lbl_3;
    private javax.swing.JLabel lbl_4;
    private javax.swing.JLabel lbl_5;
    private javax.swing.JLabel lbl_6;
    private javax.swing.JLabel lbl_7;
    private javax.swing.JLabel lbl_8;
    // End of variables declaration//GEN-END:variables

   private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("imag_small_2.png")));
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

/**
 *
 * @author marcelo
 */
public class Principal extends javax.swing.JFrame {
    int xMouse;
    int yMouse;

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        clientButton = new javax.swing.JButton();
        uAccountButton = new javax.swing.JButton();
        coinButton = new javax.swing.JButton();
        staffButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        clientButton.setBackground(new java.awt.Color(0, 134, 190));
        clientButton.setForeground(new java.awt.Color(255, 255, 255));
        clientButton.setText("Cliente");
        clientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientButtonActionPerformed(evt);
            }
        });
        Background.add(clientButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        uAccountButton.setBackground(new java.awt.Color(0, 134, 190));
        uAccountButton.setForeground(new java.awt.Color(255, 255, 255));
        uAccountButton.setText("Cuenta");
        uAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uAccountButtonActionPerformed(evt);
            }
        });
        Background.add(uAccountButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        coinButton.setBackground(new java.awt.Color(0, 134, 190));
        coinButton.setForeground(new java.awt.Color(255, 255, 255));
        coinButton.setText("Moneda");
        coinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coinButtonActionPerformed(evt);
            }
        });
        Background.add(coinButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        staffButton.setBackground(new java.awt.Color(0, 134, 190));
        staffButton.setForeground(new java.awt.Color(255, 255, 255));
        staffButton.setText("Personal");
        staffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffButtonActionPerformed(evt);
            }
        });
        Background.add(staffButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        exitButton.setBackground(new java.awt.Color(0, 134, 190));
        exitButton.setForeground(new java.awt.Color(255, 255, 255));
        exitButton.setText("Salir");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        Background.add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        jButton6.setBackground(new java.awt.Color(0, 134, 190));
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Prestamo");
        Background.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jButton7.setBackground(new java.awt.Color(0, 134, 190));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Tarjetas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Background.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));
        Background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 10));
        Background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 270, 10));

        jLabel1.setFont(new java.awt.Font("Roboto", 3, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestor de tablas de la base de datos");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 320, 50));

        jPanel2.setBackground(new java.awt.Color(0, 134, 190));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientButtonActionPerformed
        // TODO add your handling code here:
        clientTable client=new clientTable();
        client.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clientButtonActionPerformed

    private void staffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffButtonActionPerformed
        // TODO add your handling code here:
        personalTable personal=new personalTable();
        personal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_staffButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void uAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uAccountButtonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_uAccountButtonActionPerformed

    private void coinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coinButtonActionPerformed
        // TODO add your handling code here:
        coinTable coin=new coinTable();
        coin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_coinButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton clientButton;
    private javax.swing.JButton coinButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton staffButton;
    private javax.swing.JButton uAccountButton;
    // End of variables declaration//GEN-END:variables
}
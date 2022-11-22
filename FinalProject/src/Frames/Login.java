/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Login extends javax.swing.JFrame {
    /*
    estas variables son utilizadas por la barra superior de la ventana para leer la posicion
    actual del mouse , y moverla correctamente
    */
    int xMouse , yMouse;

    /**
     * Creacion de la ventana incial llamada "login "
     */
    public Login() {
        initComponents();
        
        /*
        el comando "this.setLocationRelativeTo(null);" se repetira en todas nuestras ventanas
        el mismo nos permite controlar donde aparecen las ventanas al ser llamadas. 
        el valor null hara que se abran las ventanas en el centro de nuestra pantalla
        */
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        background = new javax.swing.JPanel();
        title1 = new javax.swing.JLabel();
        circlelogo = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        informaricas = new javax.swing.JLabel();
        ini = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        nameUser = new javax.swing.JTextField();
        separador1 = new javax.swing.JSeparator();
        contraseña = new javax.swing.JLabel();
        separador2 = new javax.swing.JSeparator();
        passUser = new javax.swing.JPasswordField();
        barra = new javax.swing.JPanel();
        aceptbutton = new javax.swing.JButton();
        closebotton = new javax.swing.JPanel();
        closetext = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(800, 500));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title1.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title1.setForeground(new java.awt.Color(255, 255, 255));
        title1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title1.setText("Banco Chaban");
        title1.setPreferredSize(new java.awt.Dimension(296, 17));
        background.add(title1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, 290, 30));

        circlelogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        circlelogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N
        circlelogo.setPreferredSize(new java.awt.Dimension(296, 150));
        background.add(circlelogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 300, 170));

        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/city.png"))); // NOI18N
        background.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 0, -1, 500));

        informaricas.setFont(new java.awt.Font("Liberation Sans", 3, 36)); // NOI18N
        informaricas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        informaricas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/favicon.png"))); // NOI18N
        informaricas.setText("Soluciones informaticas");
        background.add(informaricas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 500, 80));

        ini.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        ini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ini.setText("INICIAR SESIÓN");
        background.add(ini, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 230, -1));

        usuario.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        usuario.setText("USUARIO");
        background.add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        nameUser.setForeground(new java.awt.Color(204, 204, 204));
        nameUser.setText("root");
        nameUser.setBorder(null);
        nameUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameUserMousePressed(evt);
            }
        });
        nameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameUserActionPerformed(evt);
            }
        });
        background.add(nameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 440, -1));
        background.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 10));

        contraseña.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        contraseña.setText("CONTRASEÑA");
        background.add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));
        background.add(separador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 450, 10));

        passUser.setForeground(new java.awt.Color(204, 204, 204));
        passUser.setText(" ");
        passUser.setBorder(null);
        passUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passUserMousePressed(evt);
            }
        });
        background.add(passUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 450, -1));

        barra.setBackground(new java.awt.Color(255, 255, 255));
        barra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barra.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraMouseDragged(evt);
            }
        });
        barra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barraLayout = new javax.swing.GroupLayout(barra);
        barra.setLayout(barraLayout);
        barraLayout.setHorizontalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 760, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        background.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 760, 30));

        aceptbutton.setBackground(new java.awt.Color(0, 134, 190));
        aceptbutton.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        aceptbutton.setForeground(new java.awt.Color(255, 255, 255));
        aceptbutton.setText("Aceptar");
        aceptbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        aceptbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptbuttonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptbuttonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptbuttonMouseExited(evt);
            }
        });
        aceptbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptbuttonActionPerformed(evt);
            }
        });
        background.add(aceptbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        closebotton.setBackground(new java.awt.Color(255, 255, 255));
        closebotton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        closetext.setFont(new java.awt.Font("Noto Mono", 3, 24)); // NOI18N
        closetext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closetext.setText("x");
        closetext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closetextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closetextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closetextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closebottonLayout = new javax.swing.GroupLayout(closebotton);
        closebotton.setLayout(closebottonLayout);
        closebottonLayout.setHorizontalGroup(
            closebottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closetext, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        closebottonLayout.setVerticalGroup(
            closebottonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(closetext, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        background.add(closebotton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aceptbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptbuttonActionPerformed

        /*
        El siguiente if comprueba si el usuario y la contraseña ingresados son validos.
        los mismos son "root" y " " por que podemos acceder a la base de datos solamente
        de manera local.
        en caso de comprobarse la veracidad de los mismos se nos abre la siguiente ventana.
        */
        if (nameUser.getText().equals("root") && String.valueOf(passUser.getPassword()).equals(" ")) {
            JOptionPane.showMessageDialog(rootPane, "Los datos son correctos");
            Principal principal=new Principal();
            principal.setVisible(true);
            this.dispose();
            
        } else {
            JOptionPane.showMessageDialog(rootPane, "Los datos son incorrectos");
        }
    }//GEN-LAST:event_aceptbuttonActionPerformed

    private void closetextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closetextMouseClicked

        /*
        al cliclear sobre el texto de la "X" se cerrara el programa
        */
        System.exit(0);
    }//GEN-LAST:event_closetextMouseClicked

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        /*
        toma la posicion actual de nuestro cursor al presionar la barra 
        */
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        /*
        lee activamente la posicion de nuestro cursor en la pantalla mientras presionamos
        la barra superior de la ventana
        */
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void closetextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closetextMouseEntered
        // TODO add your handling code here:
        closebotton.setBackground(Color.red);
        closetext.setForeground(Color.white);
    }//GEN-LAST:event_closetextMouseEntered

    private void closetextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closetextMouseExited
        // TODO add your handling code here:
        closebotton.setBackground(Color.white);
        closetext.setForeground(Color.black);
    }//GEN-LAST:event_closetextMouseExited

    private void nameUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameUserMousePressed
        // TODO add your handling code here:
        if (nameUser.getText().equals("INGRESE EL NOMBRE DE USUARIO")) {
            nameUser.setText("");
            nameUser.setForeground(Color.BLACK);
        }
        
        if (String.valueOf(passUser.getPassword()).isEmpty()) {
            passUser.setText("******");
            passUser.setForeground(Color.GRAY);
            
        }
        
    }//GEN-LAST:event_nameUserMousePressed

    private void passUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passUserMousePressed
        // TODO add your handling code here:
        if (String.valueOf(passUser.getPassword()).equals("******")) {
            passUser.setText("");
            passUser.setForeground(Color.BLACK);
        }
        if (nameUser.getText().isEmpty()) {
            nameUser.setText("root");
            nameUser.setForeground(Color.GRAY);
            
        }
    }//GEN-LAST:event_passUserMousePressed

    private void aceptbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptbuttonMouseClicked
        // TODO add your handling code here:
        JOptionPane.showConfirmDialog(rootPane, xMouse);
    }//GEN-LAST:event_aceptbuttonMouseClicked

    private void aceptbuttonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptbuttonMouseEntered
        // TODO add your handling code here:
        aceptbutton.setBackground(new Color(0,156,223));
    }//GEN-LAST:event_aceptbuttonMouseEntered

    private void aceptbuttonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptbuttonMouseExited
        // TODO add your handling code here:
        aceptbutton.setBackground(new Color(0,134,190));
    }//GEN-LAST:event_aceptbuttonMouseExited

    private void nameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameUserActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptbutton;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barra;
    private java.awt.Choice choice1;
    private javax.swing.JLabel circlelogo;
    private javax.swing.JLabel city;
    private javax.swing.JPanel closebotton;
    private javax.swing.JLabel closetext;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel informaricas;
    private javax.swing.JLabel ini;
    private javax.swing.JTextField nameUser;
    private javax.swing.JPasswordField passUser;
    private javax.swing.JSeparator separador1;
    private javax.swing.JSeparator separador2;
    private javax.swing.JLabel title1;
    private javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}

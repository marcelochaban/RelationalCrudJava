 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Clases.Conectar;
import Clases.Modelos;
import Clases.cuentas;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author marcelo
 */
public class cardTable extends javax.swing.JFrame {

    int yMouse,xMouse;
    String tipo;
    /**
     * Creates new form cardTable
     */
    public cardTable() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrartabla("");
        llenarCuentas();
    }
    
    private void llenarCuentas(){
        Modelos mod= new Modelos();
        ArrayList<cuentas> listacuenta = mod.getCuentas();
        
        cbxCuenta.removeAllItems();
        
        for (int i = 0; i < listacuenta.size(); i++) {
            
            cbxCuenta.addItem(new cuentas(listacuenta.get(i).getId_cuenta(),listacuenta.get(i).getNumero_cuenta()));
            
        }
    }
    void mostrartabla(String valor){
        
        DefaultTableModel modelo=new DefaultTableModel();
        
        modelo.addColumn("id");
        modelo.addColumn("numero");
        modelo.addColumn("titular");
        modelo.addColumn("cuenta");
        modelo.addColumn("tipo");
        table.setModel(modelo);
        

        //String sql="SELECT tarjetas.id_tarjeta,tarjetas.numero_tarjeta,tarjetas.nombre_titular,cuenta.numero_cuenta,tipo_tarjeta.tipo FROM tarjetas INNER JOIN tipo_tarjeta ON tipo_tarjeta.id_tipo = tarjetas.id_tipo  INNER JOIN cuenta ON cuenta.id_cuenta = tarjetas.id_cuenta";
        String sql="SELECT * FROM tarjetas";
        
        
        String datos[]=new String[5];

        Statement st;
        
        try {
            st= cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            
            while(rs.next()){
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);

                
                modelo.addRow(datos);
            }
            
           table.setModel(modelo);
            
        } catch (SQLException e) {
            
            System.err.println("Error en el llamado de la tabla... "+e);
            
            JOptionPane.showMessageDialog(null,"Error en el llamado de la tabla");
            
        }
        
    }
    
    void limpiar(){
        idTxt.setText("");
        numTxt.setText("");
        titularTxt.setText("");
        tipo="";
        checkCred.setSelected(false);
        checkDeb.setSelected(false);
        cbxCuenta.removeAllItems();

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
        closeButton = new javax.swing.JPanel();
        closeText = new javax.swing.JLabel();
        backButton = new javax.swing.JPanel();
        backText = new javax.swing.JLabel();
        barra = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        titularTxt = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        cbxCuenta = new javax.swing.JComboBox<>();
        checkCred = new javax.swing.JCheckBox();
        checkDeb = new javax.swing.JCheckBox();
        deleteTxt = new javax.swing.JButton();
        updateTxt = new javax.swing.JButton();
        cleanTxt = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 134, 190));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 134, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        closeButton.setBackground(new java.awt.Color(255, 255, 255));
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeButtonMouseExited(evt);
            }
        });

        closeText.setFont(new java.awt.Font("Noto Mono", 3, 24)); // NOI18N
        closeText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        closeText.setText("x");
        closeText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout closeButtonLayout = new javax.swing.GroupLayout(closeButton);
        closeButton.setLayout(closeButtonLayout);
        closeButtonLayout.setHorizontalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonLayout.createSequentialGroup()
                .addComponent(closeText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        closeButtonLayout.setVerticalGroup(
            closeButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(closeButtonLayout.createSequentialGroup()
                .addComponent(closeText)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        backText.setFont(new java.awt.Font("Noto Mono", 3, 18)); // NOI18N
        backText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        backText.setText("<--");
        backText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backTextMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backTextMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backTextMouseExited(evt);
            }
        });

        javax.swing.GroupLayout backButtonLayout = new javax.swing.GroupLayout(backButton);
        backButton.setLayout(backButtonLayout);
        backButtonLayout.setHorizontalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backText, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        backButtonLayout.setVerticalGroup(
            backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
            .addGroup(backButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backText, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        jPanel1.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 40, 30));

        barra.setBackground(new java.awt.Color(255, 255, 255));
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
            .addGap(0, 690, Short.MAX_VALUE)
        );
        barraLayout.setVerticalGroup(
            barraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(barra, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 690, 30));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registro de Tarjetas");

        jLabel2.setText("id:");

        idTxt.setEditable(false);
        idTxt.setBorder(null);

        jLabel3.setText("numero de tarjeta:");

        numTxt.setBorder(null);

        titularTxt.setBorder(null);

        jLabel4.setText("nombre del titular:");

        jLabel5.setText("id cuenta:");

        cbxCuenta.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        cbxCuenta.setBorder(null);
        cbxCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCuentaActionPerformed(evt);
            }
        });

        checkCred.setText("Credito");
        checkCred.setBorder(null);
        checkCred.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCredActionPerformed(evt);
            }
        });

        checkDeb.setText("Debito");
        checkDeb.setBorder(null);
        checkDeb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkDebActionPerformed(evt);
            }
        });

        deleteTxt.setBackground(new java.awt.Color(0, 134, 190));
        deleteTxt.setForeground(new java.awt.Color(255, 255, 255));
        deleteTxt.setText("Eliminar");
        deleteTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTxtActionPerformed(evt);
            }
        });

        updateTxt.setBackground(new java.awt.Color(0, 134, 190));
        updateTxt.setForeground(new java.awt.Color(255, 255, 255));
        updateTxt.setText("Guardar");
        updateTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTxtActionPerformed(evt);
            }
        });

        cleanTxt.setBackground(new java.awt.Color(0, 134, 190));
        cleanTxt.setForeground(new java.awt.Color(255, 255, 255));
        cleanTxt.setText("Actualizar");
        cleanTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanTxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idTxt))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(numTxt))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titularTxt))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCuenta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(checkCred, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(checkDeb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(cleanTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateTxt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deleteTxt)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(titularTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkCred)
                    .addComponent(checkDeb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deleteTxt)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cleanTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateTxt)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, 260));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeTextMouseClicked

    private void closeTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseEntered
        // TODO add your handling code here:
        closeButton.setBackground(Color.red);
        closeText.setForeground(Color.white);
    }//GEN-LAST:event_closeTextMouseEntered

    private void closeTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTextMouseExited
        // TODO add your handling code here:
        closeButton.setBackground(Color.white);
        closeText.setForeground(Color.black);
    }//GEN-LAST:event_closeTextMouseExited

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_closeButtonMouseClicked

    private void closeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonMouseEntered

    private void closeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonMouseExited

    private void backTextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseClicked
        // TODO add your handling code here:
        Principal principal=new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backTextMouseClicked

    private void backTextMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseEntered
        // TODO add your handling code here:
        backButton.setBackground(Color.red);
        backText.setForeground(Color.white);
    }//GEN-LAST:event_backTextMouseEntered

    private void backTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backTextMouseExited
        // TODO add your handling code here:
        backButton.setBackground(Color.white);
        backText.setForeground(Color.black);
    }//GEN-LAST:event_backTextMouseExited

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backButtonMouseClicked

    private void barraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraMouseDragged

    private void barraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraMousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraMousePressed

    private void checkCredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCredActionPerformed
        // TODO add your handling code here:
        if (checkCred.isSelected()) {
            tipo="1";
            checkDeb.setSelected(false);
        }
    }//GEN-LAST:event_checkCredActionPerformed

    private void deleteTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTxtActionPerformed
        // TODO add your handling code here:
        int eleccion = JOptionPane.showConfirmDialog(null, "¿Está seguro que desea eliminar este registro?");
            if (eleccion==JOptionPane.YES_OPTION) {
                try {
                    PreparedStatement ps=cn.prepareStatement ("DELETE FROM tarjetas WHERE id_tarjeta='"+idTxt.getText()+"'");
                    int respuesta=ps.executeUpdate();
                    if (respuesta>0) {
                        
                        JOptionPane.showMessageDialog(null, "Registro Eliminado");
                        mostrartabla("");

                    } else {

                        JOptionPane.showMessageDialog(null, "No ha seleccionado el registro");

                    }

                    } catch (SQLException e) {
            
            System.err.println("Error al eliminar... "+e);
            JOptionPane.showMessageDialog(null, "Error al eliminar");
            
        }      
            } else {
                    
                    JOptionPane.showMessageDialog(null, "la operación fue cancelada");
                    mostrartabla("");
                    
                }

    }//GEN-LAST:event_deleteTxtActionPerformed

    private void updateTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTxtActionPerformed
        // TODO add your handling code here:
        int clien=cbxCuenta.getItemAt(cbxCuenta.getSelectedIndex()).getId_cuenta();


        
        String clienS= ""+clien;

        
        try {
            PreparedStatement ps=cn.prepareStatement("INSERT INTO tarjetas (numero_tarjeta,nombre_titular,id_cuenta)VALUES  (?,?,?)");                             
            
            
            
            ps.setString(1,numTxt.getText() );
            ps.setString(2,titularTxt.getText() );
            ps.setString(3,clienS);

            
            ps.executeUpdate();
            
            limpiar();
            llenarCuentas();
            mostrartabla("");
            JOptionPane.showMessageDialog(null,"Se guardo correctamente");
            
        } catch (Exception e) {
            
            System.err.println("Error al guardar..."+e);
            JOptionPane.showMessageDialog(null,"Error al guardar");
            
        }

    }//GEN-LAST:event_updateTxtActionPerformed

    private void cleanTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleanTxtActionPerformed
        // TODO add your handling code here:
         try {    
                PreparedStatement ps=cn.prepareStatement ("UPDATE tarjetas SET numero_tarjeta='"+numTxt.getText()+"',nombre_titular='"+titularTxt.getText()+"' where id_tarjeta='"+idTxt.getText()+"'");

                int respuesta=ps.executeUpdate();
            
                if (respuesta>0){
                    JOptionPane.showMessageDialog(null,"Datos acutalizados");
                    limpiar();
                    llenarCuentas();
                    mostrartabla("");
                 }else{
                    JOptionPane.showMessageDialog(null,"No selecciono la fila");
                }
                } catch (SQLException e) {
                    System.err.println("Error al actualizar... "+e);
                    JOptionPane.showMessageDialog(null,"Error al actualizar");   
        }

    }//GEN-LAST:event_cleanTxtActionPerformed

    private void checkDebActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkDebActionPerformed
        // TODO add your handling code here:
        checkCred.setSelected(false);
        if (checkCred.isSelected()) {
            tipo="3";
        }
    }//GEN-LAST:event_checkDebActionPerformed

    private void cbxCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCuentaActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        int fila=this.table.getSelectedRow();
        
        this.idTxt.setText(this.table.getValueAt(fila,0).toString());
        this.numTxt.setText(this.table.getValueAt(fila,1).toString());
        this.titularTxt.setText(this.table.getValueAt(fila,2).toString());
        this.cbxCuenta.setEditable(false);
        checkCred.setSelected(false);
        checkDeb.setSelected(false);
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(cardTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cardTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cardTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cardTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cardTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backButton;
    private javax.swing.JLabel backText;
    private javax.swing.JPanel barra;
    private javax.swing.JComboBox<cuentas> cbxCuenta;
    private javax.swing.JCheckBox checkCred;
    private javax.swing.JCheckBox checkDeb;
    private javax.swing.JButton cleanTxt;
    private javax.swing.JPanel closeButton;
    private javax.swing.JLabel closeText;
    private javax.swing.JButton deleteTxt;
    private javax.swing.JTextField idTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField numTxt;
    private javax.swing.JTable table;
    private javax.swing.JTextField titularTxt;
    private javax.swing.JButton updateTxt;
    // End of variables declaration//GEN-END:variables
    Conectar con=new Conectar();
    Connection cn=con.conexion();
}

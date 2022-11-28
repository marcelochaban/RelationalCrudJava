/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;


import com.mysql.jdbc.ResultSetImpl;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author marcelo
 */
public class Modelos {
    
    public ArrayList<Clientes>getclientes(){
        
        Conectar con=new Conectar();
        Connection cn=con.conexion();
        Statement st;
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        ResultSet rs;
        try {
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT * FROM cliente");
            while( rs.next()){
                
                System.out.println("1");
                Clientes cliente= new Clientes();
                System.out.println("2");
                cliente.setId_cliente(rs.getInt("id_cliente"));
                cliente.setNombre_cliente(rs.getString("nombre_cliente"));
                cliente.setApellido_cliente(rs.getString("apellido_cliente"));
                cliente.setDni_cliente(rs.getString("dni_cliente"));
                cliente.setTelefono_cliente(rs.getString("telefono_cliente"));
                cliente.setCorreo_cliente(rs.getString("correo_cliente"));
                
                listaClientes.add(cliente);
                
                
                
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el llenado de comboBox cliente");
        }
        
        return listaClientes;
        
    }
    
    public ArrayList<Monedas>getMonedas(){
        
        Conectar con=new Conectar();
        Connection cn=con.conexion();
        Statement st;
        ArrayList<Monedas> listaMonedas = new ArrayList<>();
        ResultSet rs;
        try {
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT * FROM moneda");
            while( rs.next()){
                
                System.out.println("1");
                Monedas moneda= new Monedas();
                System.out.println("2");
                moneda.setId_moneda(rs.getInt("id_moneda"));
                moneda.setNombre_moneda(rs.getString("nombre_moneda"));

                listaMonedas.add(moneda);
                
                
                
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el llenado de comboBox moneda");
        }
        
        return listaMonedas;
        
    }
    
    public ArrayList<personales>getPersonales(){
        
        Conectar con=new Conectar();
        Connection cn=con.conexion();
        Statement st;
        ArrayList<personales> listaPersonal = new ArrayList<>();
        ResultSet rs;
        try {
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT * FROM personal");
            while( rs.next()){
                
                System.out.println("1");
                personales personal= new personales();
                System.out.println("2");
                personal.setId_personal(rs.getInt("id_personal"));
                personal.setNombre_personal(rs.getString("nombre_personal"));
                personal.setApellido_personal(rs.getString("apellido_personal"));
                personal.setDni_personal(rs.getString("dni_personal"));
                personal.setTelefono_personal(rs.getString("telefono_personal"));
                personal.setCorreo_personal(rs.getString("correo_personal"));

                listaPersonal.add(personal);
                
                
                
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el llenado de comboBox personal");
        }
        
        return listaPersonal;
        
    }
    
     public ArrayList<cuentas>getCuentas(){
        
        Conectar con=new Conectar();
        Connection cn=con.conexion();
        Statement st;
        ArrayList<cuentas> listaCuenta = new ArrayList<>();
        ResultSet rs;
        try {
            
            st = cn.createStatement();
            rs=st.executeQuery("SELECT * FROM cuenta");
            while( rs.next()){
                
                cuentas cuenta = new cuentas();
                cuenta.setId_cuenta(rs.getInt("id_cuenta"));
                cuenta.setNumero_cuenta(rs.getString("numero_cuenta"));
                cuenta.setClave_cuenta(rs.getString("clave_cuenta"));
                cuenta.setId_cliente(rs.getInt("id_cliente"));
                cuenta.setId_moneda(rs.getInt("id_moneda"));


                listaCuenta.add(cuenta);
                
                
                
            }
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el llenado de comboBox cuenta");
        }
        
        return listaCuenta;
        
    }
}

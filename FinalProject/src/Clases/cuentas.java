/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marcelo
 */
public class cuentas {
    
    private int id_cuenta;
    private String numero_cuenta;
    private String clave_cuenta;
    private int id_cliente;
    private int id_moneda;

    public int getId_cuenta() {
        return id_cuenta;
    }
    
    public cuentas(){
    
    }
    
    public cuentas(int id_cuenta){
        this.id_cuenta=id_cuenta;
    }
    
    public cuentas(int id_cuenta ,String numero_cuenta ){
        this.id_cuenta=id_cuenta;
        this.numero_cuenta=numero_cuenta;
        

    
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public String getClave_cuenta() {
        return clave_cuenta;
    }

    public void setClave_cuenta(String clave_cuenta) {
        this.clave_cuenta = clave_cuenta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(int id_moneda) {
        this.id_moneda = id_moneda;
    }
    
    public String toString(){
        return ""+numero_cuenta;
    }
    
}

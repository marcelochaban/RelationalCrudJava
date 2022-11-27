/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marcelo
 */
public class Monedas {
    
    private int id_moneda;
    private String nombre_moneda;
    
    public Monedas(){
    }
    
    public Monedas(String nombre_moneda ){
        
        this.nombre_moneda=nombre_moneda;

    }
    
    public Monedas(int id_moneda  ){
        
        this.id_moneda=id_moneda;

    }
    
 
    
  

    public int getId_moneda() {
        return id_moneda;
    }

    public void setId_moneda(int id_moneda) {
        this.id_moneda = id_moneda;
    }

    public String getNombre_moneda() {
        return nombre_moneda;
    }

    public void setNombre_moneda(String nombre_moneda) {
        this.nombre_moneda = nombre_moneda;
    }

 
    public String toString(){
        return ""+nombre_moneda;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author marcelo
 */
public class personales {
    
    private int id_personal;
    private String nombre_personal;
    private String apellido_personal;
    private String dni_personal;
    private String telefono_personal;
    private String correo_personal;

    
    public personales(){
    }
    public personales(int id_cliente){
        this.id_personal=id_personal;
    }
    
    public personales(int id_personal ,String nombre_personal ,String apellido_personal ){
        this.id_personal=id_personal;
        this.apellido_personal=apellido_personal;
        this.nombre_personal=nombre_personal;

    
    }
    
    public int getId_personal() {
        return id_personal;
    }

    public void setId_personal(int id_personal) {
        this.id_personal = id_personal;
    }

    public String getNombre_personal() {
        return nombre_personal;
    }

    public void setNombre_personal(String nombre_personal) {
        this.nombre_personal = nombre_personal;
    }

    public String getApellido_personal() {
        return apellido_personal;
    }

    public void setApellido_personal(String apellido_personal) {
        this.apellido_personal = apellido_personal;
    }

    public String getDni_personal() {
        return dni_personal;
    }

    public void setDni_personal(String dni_personal) {
        this.dni_personal = dni_personal;
    }

    public String getTelefono_personal() {
        return telefono_personal;
    }

    public void setTelefono_personal(String telefono_personal) {
        this.telefono_personal = telefono_personal;
    }

    public String getCorreo_personal() {
        return correo_personal;
    }

    public void setCorreo_personal(String correo_personal) {
        this.correo_personal = correo_personal;
    }
    
    public String toString(){
        return nombre_personal + " " + apellido_personal;
    }
}

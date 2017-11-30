/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Modelo;

/**
 *
 * @author alvar
 */
public class Administradores {
    //Atributos
    private String emailSeguridad;
    private String nombre;
    private int claveSeguridad;
    //Constructores

    public Administradores() {
    }

    public Administradores(String emailSeguridad,String nombre, int claveSeguridad) {
        this.emailSeguridad = emailSeguridad;
        this.nombre=nombre;
        this.claveSeguridad = claveSeguridad;
    }
    //Mutadores

    public String getEmailSeguridad() {
        return emailSeguridad;
    }

    public void setEmailSeguridad(String emailSeguridad) {
        this.emailSeguridad = emailSeguridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(int claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
    }
    
}

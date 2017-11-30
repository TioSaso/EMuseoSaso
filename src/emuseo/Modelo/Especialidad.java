/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Modelo;

/**
 *
 * @author 19875861-2
 */
public class Especialidad {
    //Atributo
    private int codigoEspecialidad;
    private String nombreEspecialidad;
    //Constructores

    public Especialidad() {
    }

    public Especialidad(int codigoEspecialidad, String nombreEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Especialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public Especialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }
    

    //Mutadores

    public int getCodigoEspecialidad() {
        return codigoEspecialidad;
    }

    public void setCodigoEspecialidad(int codigoEspecialidad) {
        this.codigoEspecialidad = codigoEspecialidad;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }
    
    
}

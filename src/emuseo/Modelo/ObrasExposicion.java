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
public class ObrasExposicion {
    //Atributos
    private int codigoObraArte;
    private int codigoExposicion;
    private String ubicacion;
    private String nombreObraArte;
    private String nombreExposicion;
    //Constructores

    public ObrasExposicion() {
    }
//Insertar
    public ObrasExposicion(int codigoObraArte, int codigoExposicion, String ubicacion) {
        this.codigoObraArte = codigoObraArte;
        this.codigoExposicion = codigoExposicion;
        this.ubicacion = ubicacion;
    }
    //Mostrar

    public ObrasExposicion(String nombreObraArte, String nombreExposicion, String ubicacion) {
        this.nombreObraArte = nombreObraArte;
        this.nombreExposicion = nombreExposicion;
        this.ubicacion = ubicacion;
    }
    
    //Mutadores

    public int getCodigoObraArte() {
        return codigoObraArte;
    }

    public void setCodigoObraArte(int codigoObraArte) {
        this.codigoObraArte = codigoObraArte;
    }

    public int getCodigoExposicion() {
        return codigoExposicion;
    }

    public void setCodigoExposicion(int codigoExposicion) {
        this.codigoExposicion = codigoExposicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getNombreObraArte() {
        return nombreObraArte;
    }

    public void setNombreObraArte(String nombreObraArte) {
        this.nombreObraArte = nombreObraArte;
    }

    public String getNombreExposicion() {
        return nombreExposicion;
    }

    public void setNombreExposicion(String nombreExposicion) {
        this.nombreExposicion = nombreExposicion;
    }
    
}

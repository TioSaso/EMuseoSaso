/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Modelo;

import java.util.Date;

/**
 *
 * @author alvar
 */
public class Exposiciones extends Galerias {
    //Atributos
    private int codigoExposicion;
    private String nombreExposicion;
    private String fechaInicioExposicion;
    private String fechaTerminoExposicion;
    //Constructores

    public Exposiciones() {
    }

    public Exposiciones(int codigoExposicion, String nombreExposicion, String fechaInicioExposicion, String fechaTerminoExposicion, int codigoGaleria) {
        super(codigoGaleria);
        this.codigoExposicion = codigoExposicion;
        this.nombreExposicion = nombreExposicion;
        this.fechaInicioExposicion = fechaInicioExposicion;
        this.fechaTerminoExposicion = fechaTerminoExposicion;
    }

    public Exposiciones(int codigoExposicion, String nombreExposicion, String fechaInicioExposicion, String fechaTerminoExposicion, String nombregaleria) {
        super(nombregaleria);
        this.codigoExposicion = codigoExposicion;
        this.nombreExposicion = nombreExposicion;
        this.fechaInicioExposicion = fechaInicioExposicion;
        this.fechaTerminoExposicion = fechaTerminoExposicion;
    }


    public Exposiciones(int codigoExposicion) {
        this.codigoExposicion = codigoExposicion;
    }

    public Exposiciones(String nombreExposicion) {
        this.nombreExposicion = nombreExposicion;
    }

    //Mutadores

    public int getCodigoExposicion() {
        return codigoExposicion;
    }

    public void setCodigoExposicion(int codigoExposicion) {
        this.codigoExposicion = codigoExposicion;
    }

    public String getNombreExposicion() {
        return nombreExposicion;
    }

    public void setNombreExposicion(String nombreExposicion) {
        this.nombreExposicion = nombreExposicion;
    }

    public String getFechaInicioExposicion() {
        return fechaInicioExposicion;
    }

    public void setFechaInicioExposicion(String fechaInicioExposicion) {
        this.fechaInicioExposicion = fechaInicioExposicion;
    }

    public String getFechaTerminoExposicion() {
        return fechaTerminoExposicion;
    }

    public void setFechaTerminoExposicion(String fechaTerminoExposicion) {
        this.fechaTerminoExposicion = fechaTerminoExposicion;
    }
    

}

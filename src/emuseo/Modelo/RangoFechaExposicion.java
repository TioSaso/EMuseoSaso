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
public class RangoFechaExposicion extends Exposiciones{
    //Atributos
    private String fechaInicioExposicion;
    private String fechaTerminoExposicion;
    //Constructores

    public RangoFechaExposicion() {
    }

    public RangoFechaExposicion(String fechaInicioExposicion, String fechaTerminoExposicion, int codigoExposicion) {
        super(codigoExposicion);
        this.fechaInicioExposicion = fechaInicioExposicion;
        this.fechaTerminoExposicion = fechaTerminoExposicion;
    }

    public RangoFechaExposicion(String fechaInicioExposicion, String fechaTerminoExposicion, String nombreExposicion) {
        super(nombreExposicion);
        this.fechaInicioExposicion = fechaInicioExposicion;
        this.fechaTerminoExposicion = fechaTerminoExposicion;
    }
    //Mutadores

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

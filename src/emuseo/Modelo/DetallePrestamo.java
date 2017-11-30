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
public class DetallePrestamo {

    //Atributos
    private int codigoObra;
    private int folioPrestamo;
    private String observacion;
    private int lineaPrestamo;
    //Constructores

    public DetallePrestamo() {
    }

    public DetallePrestamo(int codigoObra, int folioPrestamo, String observacion, int lineaPrestamo) {
        this.codigoObra = codigoObra;
        this.folioPrestamo = folioPrestamo;
        this.observacion = observacion;
        this.lineaPrestamo = lineaPrestamo;
    }
    //Mutadores

    public int getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(int codigoObra) {
        this.codigoObra = codigoObra;
    }

    public int getFolioPrestamo() {
        return folioPrestamo;
    }

    public void setFolioPrestamo(int folioPrestamo) {
        this.folioPrestamo = folioPrestamo;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getLineaPrestamo() {
        return lineaPrestamo;
    }

    public void setLineaPrestamo(int lineaPrestamo) {
        this.lineaPrestamo = lineaPrestamo;
    }

}

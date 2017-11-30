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
public class DetalleDevolucion {
    //Atributos
    private int folioDevolucion;
    private int codigoObra;
    private String observacion;
    private int lineaDevolucion;
    //Constructores

    public DetalleDevolucion() {
    }

    public DetalleDevolucion(int folioDevolucion, int codigoObra, String observacion, int lineaDevolucion) {
        this.folioDevolucion = folioDevolucion;
        this.codigoObra = codigoObra;
        this.observacion = observacion;
        this.lineaDevolucion = lineaDevolucion;
    }
    //Mutadores

    public int getFolioDevolucion() {
        return folioDevolucion;
    }

    public void setFolioDevolucion(int folioDevolucion) {
        this.folioDevolucion = folioDevolucion;
    }

    public int getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(int codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public int getLineaDevolucion() {
        return lineaDevolucion;
    }

    public void setLineaDevolucion(int lineaDevolucion) {
        this.lineaDevolucion = lineaDevolucion;
    }
    
}

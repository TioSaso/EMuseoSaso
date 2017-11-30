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
public class FechaRestauracion {
//Atributo

    private String fecha;
//Constructores

    public FechaRestauracion() {
    }

    public FechaRestauracion(String fecha) {
        this.fecha = fecha;
    }

//Mutadores
    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}

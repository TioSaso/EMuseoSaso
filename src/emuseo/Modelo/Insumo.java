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
public class Insumo extends Tour{
    //Atributos
    private int codigoInsumo;
    private String descripcionInsumo;
    private int cantidadInsumo;
    //Constructores

    public Insumo() {
    }

    public Insumo(int codigoInsumo, String descripcionInsumo, int cantidadInsumo, int idTour) {
        super(idTour);
        this.codigoInsumo = codigoInsumo;
        this.descripcionInsumo = descripcionInsumo;
        this.cantidadInsumo = cantidadInsumo;
    }
    //Mutadores

    public int getCodigoInsumo() {
        return codigoInsumo;
    }

    public void setCodigoInsumo(int codigoInsumo) {
        this.codigoInsumo = codigoInsumo;
    }

    public String getDescripcionInsumo() {
        return descripcionInsumo;
    }

    public void setDescripcionInsumo(String descripcionInsumo) {
        this.descripcionInsumo = descripcionInsumo;
    }

    public int getCantidadInsumo() {
        return cantidadInsumo;
    }

    public void setCantidadInsumo(int cantidadInsumo) {
        this.cantidadInsumo = cantidadInsumo;
    }
    
    
}

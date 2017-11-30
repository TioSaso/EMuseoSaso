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
public class TipoOA {
    //Atributo
    private int codigoTipoOA;
    private String descripcionTipoOA;
    //Constructores

    public TipoOA() {
    }

    public TipoOA(int codigoTipoOA, String descripcionTipoOA) {
        this.codigoTipoOA = codigoTipoOA;
        this.descripcionTipoOA = descripcionTipoOA;
    }

    public TipoOA(String descripcionTipoOA) {
        this.descripcionTipoOA = descripcionTipoOA;
    }
    
    //Mutadores

    public int getCodigoTipoOA() {
        return codigoTipoOA;
    }

    public void setCodigoTipoOA(int codigoTipoOA) {
        this.codigoTipoOA = codigoTipoOA;
    }

    public String getDescripcionTipoOA() {
        return descripcionTipoOA;
    }

    public void setDescripcionTipoOA(String descripcionTipoOA) {
        this.descripcionTipoOA = descripcionTipoOA;
    }
    
           
}

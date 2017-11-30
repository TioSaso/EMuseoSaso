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
public class Visitante extends Tour {
    //Atributos
    private int codigoVisitante;
    private String nombreVisitante;
    private String tipoVisitante;
    private int cantidadVisitante;
    //Constructores

    public Visitante() {
    }

    public Visitante(int codigoVisitante, String nombreVisitante, String tipoVisitante, int cantidadVisitante, int idTour) {
        super(idTour);
        this.codigoVisitante = codigoVisitante;
        this.nombreVisitante = nombreVisitante;
        this.tipoVisitante = tipoVisitante;
        this.cantidadVisitante = cantidadVisitante;
    }
    //Mutadores

    public int getCodigoVisitante() {
        return codigoVisitante;
    }

    public void setCodigoVisitante(int codigoVisitante) {
        this.codigoVisitante = codigoVisitante;
    }

    public String getNombreVisitante() {
        return nombreVisitante;
    }

    public void setNombreVisitante(String nombreVisitante) {
        this.nombreVisitante = nombreVisitante;
    }

    public String getTipoVisitante() {
        return tipoVisitante;
    }

    public void setTipoVisitante(String tipoVisitante) {
        this.tipoVisitante = tipoVisitante;
    }

    public int getCantidadVisitante() {
        return cantidadVisitante;
    }

    public void setCantidadVisitante(int cantidadVisitante) {
        this.cantidadVisitante = cantidadVisitante;
    }
    
}

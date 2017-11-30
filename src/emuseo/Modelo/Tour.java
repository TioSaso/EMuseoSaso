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
public class Tour extends Exposiciones{
    //Atributos
    private int idTour;
    private String fechaTour;
    private int horaInicioTour;
    private int cuposTour;
    //Constructores

    public Tour() {
    }

    public Tour(int idTour, String fechaTour, int horaInicioTour, int cuposTour, int codigoExposicion) {
        super(codigoExposicion);
        this.idTour = idTour;
        this.fechaTour = fechaTour;
        this.horaInicioTour = horaInicioTour;
        this.cuposTour = cuposTour;
    }

    public Tour(int idTour, String fechaTour, int horaInicioTour, int cuposTour, String nombreExposicion) {
        super(nombreExposicion);
        this.idTour = idTour;
        this.fechaTour = fechaTour;
        this.horaInicioTour = horaInicioTour;
        this.cuposTour = cuposTour;
    }

    public Tour(int idTour) {
        this.idTour = idTour;
    }
    
    //Mutadores

    public int getIdTour() {
        return idTour;
    }

    public void setIdTour(int idTour) {
        this.idTour = idTour;
    }

    public String getFechaTour() {
        return fechaTour;
    }

    public void setFechaTour(String fechaTour) {
        this.fechaTour = fechaTour;
    }

    public int getHoraInicioTour() {
        return horaInicioTour;
    }

    public void setHoraInicioTour(int horaInicioTour) {
        this.horaInicioTour = horaInicioTour;
    }

    public int getCuposTour() {
        return cuposTour;
    }

    public void setCuposTour(int cuposTour) {
        this.cuposTour = cuposTour;
    }
        //SobreEscritura
}

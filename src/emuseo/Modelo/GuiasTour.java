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
public class GuiasTour {
    //Atributos
    private int codigoTour;
    private int codigoGuiaTuristico;
    private int horario;
    //Constructores

    public GuiasTour() {
    }

    public GuiasTour(int codigoTour, int codigoGuiaTuristico, int horario) {
        this.codigoTour = codigoTour;
        this.codigoGuiaTuristico = codigoGuiaTuristico;
        this.horario = horario;
    }
    
    //Mutadores

    public int getCodigoTour() {
        return codigoTour;
    }

    public void setCodigoTour(int codigoTour) {
        this.codigoTour = codigoTour;
    }

    public int getCodigoGuiaTuristico() {
        return codigoGuiaTuristico;
    }

    public void setCodigoGuiaTuristico(int codigoGuiaTuristico) {
        this.codigoGuiaTuristico = codigoGuiaTuristico;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
    
}

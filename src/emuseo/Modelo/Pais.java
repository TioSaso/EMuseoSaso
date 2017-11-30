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
public class Pais {
    //Atributos
    private int codigoPais;
    private String nombrePais;
    //Constructores

    public Pais() {
    }

    public Pais(int codigoPais, String nombrePais) {
        this.codigoPais = codigoPais;
        this.nombrePais = nombrePais;
    }

    public Pais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    
    //Mutadores

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }
            //SobreEscritura
    @Override
    public String toString(){
        return nombrePais;
    }
}

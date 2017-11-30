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
public class SeguroObraArte {
    //Atributos
    private int codigoSeguro;
    private String descripcionSeguro;
    private String fechaSeguro;
    private int montoSeguro;
    //Constructores

    public SeguroObraArte() {
    }

    public SeguroObraArte(int codigoSeguro, String descripcionSeguro, String fechaSeguro, int montoSeguro) {
        this.codigoSeguro = codigoSeguro;
        this.descripcionSeguro = descripcionSeguro;
        this.fechaSeguro = fechaSeguro;
        this.montoSeguro = montoSeguro;
    }
    //Mutadores

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getDescripcionSeguro() {
        return descripcionSeguro;
    }

    public void setDescripcionSeguro(String descripcionSeguro) {
        this.descripcionSeguro = descripcionSeguro;
    }

    public String getFechaSeguro() {
        return fechaSeguro;
    }

    public void setFechaSeguro(String fechaSeguro) {
        this.fechaSeguro = fechaSeguro;
    }

    public int getMontoSeguro() {
        return montoSeguro;
    }

    public void setMontoSeguro(int montoSeguro) {
        this.montoSeguro = montoSeguro;
    }
    
}

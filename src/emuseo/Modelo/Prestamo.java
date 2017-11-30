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
public class Prestamo extends Museo implements Folio{

    //Atributo
    private int folioPrestamo;
    private String fechaPrestamo;
    private String resolucionPrestamo;
    private String comentariosPrestamo;
    private int codigoSeguro;
    private int montoSeguro;
    //Constructores

    public Prestamo() {
    }

    //Para Insertar

    public Prestamo(int folioPrestamo, String fechaPrestamo, String resolucionPrestamo, String comentariosPrestamo, int codigoSeguro, int codigoMuseo) {
        super(codigoMuseo);
        this.folioPrestamo = folioPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.resolucionPrestamo = resolucionPrestamo;
        this.comentariosPrestamo = comentariosPrestamo;
        this.codigoSeguro = codigoSeguro;
    }

    //Para Mostrar

    public Prestamo(int folioPrestamo, String fechaPrestamo, String resolucionPrestamo, String comentariosPrestamo,String nombreMuseo, int montoSeguro) {
        super(nombreMuseo);
        this.folioPrestamo = folioPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.resolucionPrestamo = resolucionPrestamo;
        this.comentariosPrestamo = comentariosPrestamo;
        this.montoSeguro = montoSeguro;
    }
    

    //Mutadores
    public Prestamo(int folioPrestamo) {
        this.folioPrestamo = folioPrestamo;
    }

    public int getFolioPrestamo() {
        return folioPrestamo;
    }

    public void setFolioPrestamo(int folioPrestamo) {
        this.folioPrestamo = folioPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getResolucionPrestamo() {
        return resolucionPrestamo;
    }

    public void setResolucionPrestamo(String resolucionPrestamo) {
        this.resolucionPrestamo = resolucionPrestamo;
    }

    public String getComentariosPrestamo() {
        return comentariosPrestamo;
    }

    public void setComentariosPrestamo(String comentariosPrestamo) {
        this.comentariosPrestamo = comentariosPrestamo;
    }

    public int getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(int codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    
    public int getMontoSeguro() {
        return montoSeguro;
    }

    public void setMontoSeguro(int montoSeguro) {
        this.montoSeguro = montoSeguro;
    }

    @Override
    public int generarFolio() {
       return folioPrestamo;
    }

}

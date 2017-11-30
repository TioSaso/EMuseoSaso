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
public class Devolucion extends Prestamo {

    //Atributos
    private String fechaDevolucion;
    private int documentosAsociados;
    private String comentariosDevolucion;
    private int Seguro;

    //Constructores

    //Insertar

    public Devolucion(int folioPrestamo, String fechaDevolucion, int documentosAsociados, String comentariosDevolucion, int Seguro) {
        super(folioPrestamo);
        this.fechaDevolucion = fechaDevolucion;
        this.documentosAsociados = documentosAsociados;
        this.comentariosDevolucion = comentariosDevolucion;
        this.Seguro = Seguro;
    }


    //Mutadores

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public int getDocumentosAsociados() {
        return documentosAsociados;
    }

    public void setDocumentosAsociados(int documentosAsociados) {
        this.documentosAsociados = documentosAsociados;
    }

    public String getComentariosDevolucion() {
        return comentariosDevolucion;
    }

    public void setComentariosDevolucion(String comentariosDevolucion) {
        this.comentariosDevolucion = comentariosDevolucion;
    }

    public int getSeguro() {
        return Seguro;
    }

    public void setSeguro(int Seguro) {
        this.Seguro = Seguro;
    }





}

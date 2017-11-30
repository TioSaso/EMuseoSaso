/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Modelo;

import java.sql.Date;

/**
 *
 * @author 19875861-2
 */
public class Autores extends Nacionalidad{
    //Atributos
    private int codigoAutor;
    private String nombreAutor;
    private String fechaNacimientoAutor;
    private String fechaDefuncionAutor;
    //Constructores
    public Autores() {
    }
   //Insertar

    public Autores(int codigoAutor, String nombreAutor, String fechaNacimientoAutor, String fechaDefuncionAutor, int codigoNacionalidad) {
        super(codigoNacionalidad);
        this.codigoAutor = codigoAutor;
        this.nombreAutor = nombreAutor;
        this.fechaNacimientoAutor = fechaNacimientoAutor;
        this.fechaDefuncionAutor = fechaDefuncionAutor;
    }
    
   //Mostrar
    public Autores(int codigoAutor, String nombreAutor, String fechaNacimientoAutor, String fechaDefuncionAutor, String nombreNacionalidad) {
        super(nombreNacionalidad);
        this.codigoAutor = codigoAutor;
        this.nombreAutor = nombreAutor;
        this.fechaNacimientoAutor = fechaNacimientoAutor;
        this.fechaDefuncionAutor = fechaDefuncionAutor;
    }     
   
    public Autores(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public Autores(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }
    
    //Mutadores

    public int getCodigoAutor() {
        return codigoAutor;
    }

    public void setCodigoAutor(int codigoAutor) {
        this.codigoAutor = codigoAutor;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getFechaNacimientoAutor() {
        return fechaNacimientoAutor;
    }

    public void setFechaNacimientoAutor(String fechaNacimientoAutor) {
        this.fechaNacimientoAutor = fechaNacimientoAutor;
    }

    public String getFechaDefuncionAutor() {
        return fechaDefuncionAutor;
    }

    public void setFechaDefuncionAutor(String fechaDefuncionAutor) {
        this.fechaDefuncionAutor = fechaDefuncionAutor;
    }
    //SobreEscritura
    @Override
    public String toString(){
        return nombreAutor;
    }

}
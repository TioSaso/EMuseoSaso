
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Modelo;

/**
 *
 * @author 19875861-2
 */
public class Nacionalidad extends Pais{

    //Atributos
    private int codigoNacionalidad;
    private String nombreNacionalidad;

//Constructores
    public Nacionalidad()  {
    }

    //Constructor para Insertar

    public Nacionalidad(int codigoNacionalidad, String nombreNacionalidad, int codigoPais) {
        super(codigoPais);
        this.codigoNacionalidad = codigoNacionalidad;
        this.nombreNacionalidad = nombreNacionalidad;
    }
    //Constructor para Mostrar

    public Nacionalidad(int codigoNacionalidad, String nombreNacionalidad, String nombrePais) {
        super(nombrePais);
        this.codigoNacionalidad = codigoNacionalidad;
        this.nombreNacionalidad = nombreNacionalidad;
    }
    

    public Nacionalidad(int codigoNacionalidad) {
        this.codigoNacionalidad = codigoNacionalidad;
    }

    public Nacionalidad(String nombreNacionalidad) {
        this.nombreNacionalidad = nombreNacionalidad;
    }
    
//Mutadores

    public int getCodigoNacionalidad() {
        return codigoNacionalidad;
    }

    public void setCodigoNacionalidad(int codigoNacionalidad) {
        this.codigoNacionalidad = codigoNacionalidad;
    }

    public String getNombreNacionalidad() {
        return nombreNacionalidad;
    }

    public void setNombreNacionalidad(String nombreNacionalidad) {
        this.nombreNacionalidad = nombreNacionalidad;
    } 

        //SobreEscritura
    @Override
    public String toString(){
        return nombreNacionalidad;
    }
}

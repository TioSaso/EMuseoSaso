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
public class ListaRestauracion {
    //Atributos
    public ObraDeArte aRestaurar;
    public Restauradores esRestaurador;
    public FechaRestauracion Inicio;
    public FechaRestauracion Fin;
    //Constructores

    public ListaRestauracion(String fecha) {
        aRestaurar = new ObraDeArte();
        Inicio = new FechaRestauracion(fecha);
        esRestaurador = new Restauradores();
    }
    public FechaRestauracion getFin(){
        return Fin;
    }
    //Mutadores

    public ObraDeArte getaRestaurar() {
        return aRestaurar;
    }

    public void setaRestaurar(ObraDeArte aRestaurar) {
        this.aRestaurar = aRestaurar;
    }

    public Restauradores getEsRestaurador() {
        return esRestaurador;
    }

    public void setEsRestaurador(Restauradores esRestaurador) {
        this.esRestaurador = esRestaurador;
    }

    public FechaRestauracion getInicio() {
        return Inicio;
    }

    public void setInicio(FechaRestauracion Inicio) {
        this.Inicio = Inicio;
    }
    
}

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
public class ObraDeArte extends Autores {

    //Atributos
    private int codigoObraArte;
    private String tituloObra;
    private String fCreacionObra;
    private String fLlegadaObra;
    private int estadoObra;
    private int codigoTipo;
    private String descripcionTipoOA;
    //Constructores

    public ObraDeArte() {
    }
    //Insertar

    public ObraDeArte(int codigoObraArte, String tituloObra, String fCreacionObra, String fLlegadaObra, int estadoObra, int codigoAutor,int codigoTipo) {
        super(codigoAutor);
        this.codigoObraArte = codigoObraArte;
        this.tituloObra = tituloObra;
        this.fCreacionObra = fCreacionObra;
        this.fLlegadaObra = fLlegadaObra;
        this.estadoObra = estadoObra;
        this.codigoTipo = codigoTipo;
    }


    //Mostrar

    public ObraDeArte(int codigoObraArte, String tituloObra, String fCreacionObra, String fLlegadaObra, int estadoObra, String nombreAutor,String descripcionTipoOA ) {
        super(nombreAutor);
        this.codigoObraArte = codigoObraArte;
        this.tituloObra = tituloObra;
        this.fCreacionObra = fCreacionObra;
        this.fLlegadaObra = fLlegadaObra;
        this.estadoObra = estadoObra;
        this.descripcionTipoOA = descripcionTipoOA;
    }



    //Mutadores
    public int getCodigoObraArte() {
        return codigoObraArte;
    }

    public void setCodigoObraArte(int codigoObraArte) {
        this.codigoObraArte = codigoObraArte;
    }

    public String getTituloObra() {
        return tituloObra;
    }

    public void setTituloObra(String tituloObra) {
        this.tituloObra = tituloObra;
    }

    public String getfCreacionObra() {
        return fCreacionObra;
    }

    public void setfCreacionObra(String fCreacionObra) {
        this.fCreacionObra = fCreacionObra;
    }

    public String getfLlegadaObra() {
        return fLlegadaObra;
    }

    public void setfLlegadaObra(String fLlegadaObra) {
        this.fLlegadaObra = fLlegadaObra;
    }

    public int getEstadoObra() {
        return estadoObra;
    }

    public void setEstadoObra(int estadoObra) {
        this.estadoObra = estadoObra;
    }

    public int getCodigoTipo() {
        return codigoTipo;
    }

    public void setCodigoTipo(int codigoTipo) {
        this.codigoTipo = codigoTipo;
    }

    public String getDescripcionTipoOA() {
        return descripcionTipoOA;
    }

    public void setDescripcionTipoOA(String descripcionTipoOA) {
        this.descripcionTipoOA = descripcionTipoOA;
    }
    

}

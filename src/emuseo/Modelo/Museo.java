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
public class Museo extends Pais {

    //Atributos
    private int codigoMuseo;
    private String nombreMuseo;
    private String direccionMuseo;
    private String contactoMuseo;
    //Modificar esta weaaa acuerdate ctm

    /*private String paisMuseo;*/
    //Modifica3

    //Constructores
    public Museo() {
    }

    //Insertar
    public Museo(int codigoMuseo, String nombreMuseo, String direccionMuseo, String contactoMuseo, int codigoPais) {
        super(codigoPais);
        this.codigoMuseo = codigoMuseo;
        this.nombreMuseo = nombreMuseo;
        this.direccionMuseo = direccionMuseo;
        this.contactoMuseo = contactoMuseo;
    }
    //Mostrar

    public Museo(int codigoMuseo, String nombreMuseo, String direccionMuseo, String contactoMuseo, String nombrePais) {
        super(nombrePais);
        this.codigoMuseo = codigoMuseo;
        this.nombreMuseo = nombreMuseo;
        this.direccionMuseo = direccionMuseo;
        this.contactoMuseo = contactoMuseo;
    }

    public Museo(int codigoMuseo) {
        this.codigoMuseo = codigoMuseo;
    }

    public Museo(String nombreMuseo) {
        this.nombreMuseo = nombreMuseo;
    }

    //Mutadores
    public int getCodigoMuseo() {
        return codigoMuseo;
    }

    public void setCodigoMuseo(int codigoMuseo) {
        this.codigoMuseo = codigoMuseo;
    }

    public String getNombreMuseo() {
        return nombreMuseo;
    }

    public void setNombreMuseo(String nombreMuseo) {
        this.nombreMuseo = nombreMuseo;
    }

    public String getDireccionMuseo() {
        return direccionMuseo;
    }

    public void setDireccionMuseo(String direccionMuseo) {
        this.direccionMuseo = direccionMuseo;
    }

    public String getContactoMuseo() {
        return contactoMuseo;
    }

    public void setContactoMuseo(String contactoMuseo) {
        this.contactoMuseo = contactoMuseo;
    }
/*
    public String getPaisMuseo() {
        return paisMuseo;
    }

    public void setPaisMuseo(String paisMuseo) {
        this.paisMuseo = paisMuseo;
    }
*/
}

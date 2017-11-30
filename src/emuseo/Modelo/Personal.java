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
public class Personal {

    //Atributos
    private int codigoPersonal;
    private String nombrePersonal;
    private String rutPersonal;
    private String direccionPersonal;
    private String fonoPersonal;
    private String username;
    private String password;
    //Constructores

    public Personal() {
    }
    //Restaurador

    public class Restaurador extends Especialidad {

        public Restaurador() {
        }

        public Restaurador(String nombreEspecialidad) {
            super(nombreEspecialidad);
        }
    }
    //Clase GuiaTuristico

    public class GuiaTouristico extends Especialidad{

        public GuiaTouristico() {
        }

        public GuiaTouristico(String nombreEspecialidad) {
            super(nombreEspecialidad);
        }

 }
    //Mostrar

    public Personal(int codigoPersonal, String nombrePersonal, String rutPersonal, String username) {
        this.codigoPersonal = codigoPersonal;
        this.nombrePersonal = nombrePersonal;
        this.rutPersonal = rutPersonal;
        this.username = username;
    }

    //Insertar
    public Personal(int codigoPersonal, String nombrePersonal, String rutPersonal, String direccionPersonal, String fonoPersonal, String username, String password) {
        this.codigoPersonal = codigoPersonal;
        this.nombrePersonal = nombrePersonal;
        this.rutPersonal = rutPersonal;
        this.direccionPersonal = direccionPersonal;
        this.fonoPersonal = fonoPersonal;
        this.username = username;
        this.password = password;
    }

    public Personal(int codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    //Mutadores
    public int getCodigoPersonal() {
        return codigoPersonal;
    }

    public void setCodigoPersonal(int codigoPersonal) {
        this.codigoPersonal = codigoPersonal;
    }

    public String getNombrePersonal() {
        return nombrePersonal;
    }

    public void setNombrePersonal(String nombrePersonal) {
        this.nombrePersonal = nombrePersonal;
    }

    public String getRutPersonal() {
        return rutPersonal;
    }

    public void setRutPersonal(String rutPersonal) {
        this.rutPersonal = rutPersonal;
    }

    public String getDireccionPersonal() {
        return direccionPersonal;
    }

    public void setDireccionPersonal(String direccionPersonal) {
        this.direccionPersonal = direccionPersonal;
    }

    public String getFonoPersonal() {
        return fonoPersonal;
    }

    public void setFonoPersonal(String fonoPersonal) {
        this.fonoPersonal = fonoPersonal;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

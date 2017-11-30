/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Museo;
import emuseo.Modelo.Nacionalidad;
import emuseo.Modelo.Pais;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDMuseo {

    ArrayList<Museo> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarMuseo(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Museo WHERE codigoMuseo='" + codigo + "'");
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            conex.cerrar();
        }
        return false;
    }
    //Update

    //Modificar
    public boolean modificarMuseo(int codigo, String nombre, String direccion, String contacto, int codigoPais) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Museo SET nombreMuseo='" + nombre +"', direccionMuseo='"+direccion+"', contactoMuseo='"+contacto+"', codigoPais='"+codigoPais+ "' WHERE codigoMuseo='" + codigo + "'");
            sql.execute();
            return true;
        } catch (SQLException error) {
            System.out.println("Error: " + error);
        } finally {
            conex.cerrar();
        }
        return false;
    }
    //Create

    public boolean insertarMuseo(String nombre, String direccion, String contacto, int codigoPais) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Visitante(nombreMuseo, direccionMuseo, contactoMuseo, codigoPais) VALUES('" + nombre+"','" +direccion+"','"+contacto+"','"+codigoPais+"')");
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            conex.cerrar();
        }
        return false;
    }

    //Read
    public ArrayList mostrarPais(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoMuseo, nombreMuseo, direccionMuseo, contactoMuseo, codigoPais "
                    + "FROM Museo INNER JOIN Pais ON "
                    + "Museo.codigoPais=Pais.codigoPais"
                    + "WHERE nombreMuseo LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Museo(res.getInt("codigoMuseo"), res.getString("nombreMuseo"), res.getString("direccionMuseo"), res.getString("contactoMuseo"), res.getString("nombrePais")));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        } finally {
            //Cerrar la conexion
            conex.cerrar();
        }
        return lista;
    }
}

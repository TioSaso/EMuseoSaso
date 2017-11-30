/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Autores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDAutor {

    ArrayList<Autores> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarAutor(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Autores WHERE codigoAutor='" + codigo + "'");
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
    public boolean modificarAutor(int codigo, String nombre, String fNacimientoAutor, String fDefuncionAutor, int codigoNacionalidad) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Autores SET nombreAutor='" + nombre+ "',fechaNacimientoAutor='" + fNacimientoAutor + "',fechaDefuncionAutor='" + fDefuncionAutor + "',codigoNacionalidad='" + codigoNacionalidad + "' WHERE codigoAutor='" + codigo + "'");
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

    public boolean insertarAutor(String nombre, String fNacimiento, String fDefuncion, int codigoNacionalidad) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Autores(nombreAutor, fechaNacimientoAutor, fechaDefuncionAutor, codigoNacionalidad) VALUES('" + nombre + "','" + fNacimiento + "','" + fDefuncion + "','" + codigoNacionalidad + "')");
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
    public ArrayList mostrarAutores(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoAutor, nombreAutor, fechaNacimientoAutor, fechaDefuncionAutor, nombreNacionalidad "
                    + "FROM Autores INNER JOIN Nacionalidad ON "
                    + "Autores.codigoNacionalidad=Nacionalidad.codigoNacionalidad "
                    + "WHERE nombreAutor LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Autores(res.getInt("codigoAutor"), res.getString("nombreAutor"), res.getString("fechaNacimientoAutor"), res.getString("fechaDefuncionAutor"), res.getString("nombreNacionalidad")));
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

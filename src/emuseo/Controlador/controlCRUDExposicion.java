/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Exposiciones;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDExposicion {

    ArrayList<Exposiciones> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarExposicion(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Exposicion WHERE codigoExposicion='" + codigo + "'");
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
    public boolean modificarExposicion(int codigo, String nombre, int codigoGaleria, String fechaInicio, String fechaFin) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Exposicion SET nombreExposicion='" + nombre + "', codigoGaleria='" + codigoGaleria +"', fechaInicioExposicion='"+fechaInicio+"', fechaFinExposicion='"+fechaFin+ "' WHERE codigoExposicion='" + codigo + "'");
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

    public boolean insertarNacionalidad(String nombre, int codigoGaleria, String fechaInicio, String fechaFin) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Exposicion(nombreExposicion, codigoGaleria, fechaInicioExposicion, fechaFinExposicion) "
                    + "VALUES('" + nombre + "','" + codigoGaleria+"','"+fechaInicio+"','"+fechaFin + "')");
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
    public ArrayList mostrarExposicion(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoExposicion, nombreExposicion, nombreGaleria, fechaInicioExposicion, fechaFinExposicion "
                    + "FROM Exposicion INNER JOIN Galeria ON "
                    + "Exposicion.codigoGaleria=Galeria.codigoGaleria "
                    + "WHERE nombreExposicion LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Exposiciones(res.getInt("codigoExposicion"), res.getString("nombreExposicion"), res.getString("nombreGaleria"), res.getString("fechaInicioExposicion"), res.getString("fechaFinExposicion")));
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

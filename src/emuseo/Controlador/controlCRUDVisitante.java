/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Nacionalidad;
import emuseo.Modelo.Visitante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDVisitante {

    ArrayList<Visitante> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarVisitante(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Visitante WHERE codigoVisitante='" + codigo + "'");
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
    public boolean modificarVisitante(int codigo, String nombre, String tipovisitante, int cantidadVisitante, int codigoTour) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Visitante SET nombreVisitante='" + nombre + "', tipoVisitante='" + tipovisitante + "', cantidadVisitante='" + cantidadVisitante + "', codigoTour='" + codigoTour + "' WHERE codigoVisitante='" + codigo + "'");
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

    public boolean insertarVisitante(String nombre, String tipovisitante, int cantidadVisitante, int codigoTour) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Visitante (nombreVisitante,tipoVisitante,cantidadVisitante,codigoTour) VALUES('" + nombre + "','" + tipovisitante + "','" + cantidadVisitante + "','" + codigoTour + "')");
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
    public ArrayList mostrarVisitante(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoVisitante, nombreVisitante, tipoVisitante, cantidadVisitante, codigoPais "
                    + "FROM Visitante INNER Tour JOIN  ON "
                    + "Visitante.codigoTour=Tour.codigoTour "
                    + "WHERE nombreVisitante LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Visitante(res.getInt("codigovisitante"), res.getString("nombreVisitante"), res.getString("tipoVisitante"), res.getInt("cantidadVisitante"), res.getInt("codigoTour")));
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

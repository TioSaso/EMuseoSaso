/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Nacionalidad;
import emuseo.Modelo.Tour;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDTour {

    ArrayList<Tour> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarTour(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Tour WHERE codigoTour='" + codigo + "'");
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
    public boolean modificarTour(int codigo, String fecha, int horainicio, int cupostour, int codigoExposicion) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Tour SET fechaTour='" + fecha + "', horaInicio='" + horainicio +"', cuposTour='"+cupostour+"', codigoExposicion='"+codigoExposicion+ "' WHERE codigoTour='" + codigo + "'");
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

    public boolean insertarNacionalidad(String fecha,int horaInicio, int cuposTour, int codigoExposicion) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Tour(fechaTour,horaInicio,cuposTour,codigoExposicion) VALUES('" +fecha + "','" + horaInicio +"','"+cuposTour+"','"+codigoExposicion+ "')");
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
    public ArrayList mostrarNacionalidad(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoTour, fechaTour, horaInicio, cuposTour, nombreExposicion "
                    + "FROM Tour INNER JOIN Exposicion ON "
                    + "Tour.codigoExposicion=Exposicion.codigoExposicion "
                    + "WHERE codigoTour LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Tour(res.getInt("codigoTour"), res.getString("fechaTour"),res.getInt("horaInicio"), res.getInt("cuposTour"), res.getString("nombreExposicion")));
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

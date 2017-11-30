/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Insumo;
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
public class controlCRUDInsumo {

    ArrayList<Insumo> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarInsumo(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Insumo WHERE codigoInsumo='" + codigo + "'");
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
    public boolean modificarInsumo(int codigo, String descripcion, int cantidadInsumo, int codigoTour) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Insumo SET descripcionInsumo='" + descripcion + "', cantidadInsumo='" + cantidadInsumo +"', codigoTour='"+codigoTour+"' WHERE codigoInsumo='" + codigo + "'");
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

    public boolean insertarInsumo(String descripcion, int cantidad, int codigoTour) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Insumo(descripcionInsumo, cantidadInsumo, codigoTour )"
                    + " VALUES('" +descripcion + "','" + cantidad +"','"+codigoTour+"')");
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
    public ArrayList mostrarInsumo(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoInsumo, descripcionInsumo, cantidadInsumo, codigoTour "
                    + "FROM Insumo INNER JOIN Tour ON "
                    + "Insumo.codigoTour=Tour.codigoTour "
                    + "WHERE codigoTour LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Insumo(res.getInt("codigoInsumo"), res.getString("descripcionInsumo"),res.getInt("cantidadInsumo"), res.getInt("codigoTour")));
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

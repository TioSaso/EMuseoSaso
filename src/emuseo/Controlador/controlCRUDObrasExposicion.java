/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Nacionalidad;
import emuseo.Modelo.ObrasExposicion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDObrasExposicion {

    ArrayList<ObrasExposicion> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarOE(int codigo, int codigoExposicion) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM ObrasExposicion WHERE codigoObraArte='" + codigo + "', codigoExposicion='"+codigoExposicion+"'");
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
    public boolean modificarOE(int codigo,int codigoExposicion, String ubicacion) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE ObrasExposicion SET codigoObraArte='" + codigo + "', codigoExposicion='" + codigoExposicion +"', ubicacion='"+ubicacion+ "' WHERE codigoObraArte='" + codigo + "', codigoExposicion='"+codigoExposicion+"'");
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

    public boolean insertarOE(int codigo, int codigoExposicion,String ubicacion) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO ObraExposicion(codigoObraArte, codigoExposicion, ubicacion) VALUES('" + codigo + "','" + codigoExposicion +"','"+ubicacion+ "')");
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
    public ArrayList mostrarOE(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT nombreObraArte, nombreExposicion, ubicacion "
                    + "FROM ObraExposicion INNER JOIN ObraDeArte, Exposicion ON "
                    + "ObraExposicion.codigoObraArte=ObraDeArte.codigoObraArte "
                    + "ObraExposicion.codigoExposicion=Exposicion.codigoExposicion"
                    + "WHERE nombreObraArte LIKE '%" + nombre + "%', nombreExposicion='%"+nombre+"%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new ObrasExposicion(res.getString("nombreObraArte"), res.getString("nombreExposicion"), res.getString("ubicacion")));
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Nacionalidad;
import emuseo.Modelo.Pais;
import emuseo.Modelo.Prestamo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDPrestamo {

    ArrayList<Prestamo> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminaPrestamo(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Prestamo WHERE folioPrestamo='" + codigo + "'");
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
    public boolean modificarPrestamo(int codigo, String fecha, String resolucion, String comentario, int Museo, int codigoSeguro ) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Prestamo SET fechaPrestamo='" + fecha+"', resolucionPrestamo='" +resolucion+"', comentarioPrestamo"+comentario+"', codigoMuseo='"+Museo+"', codigoSeguro='"+codigoSeguro+ "' WHERE folioPrestamo='" + codigo + "'");
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

    public boolean insertarPrestamo(String fecha, String resolucion, String comentario, int Museo, int codigoSeguro ) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Prestamo(fechaPrestamo, resolucionPrestamo, comentarioPrestamo, codigoMuseo, codigoSeguro) VALUES('" + fecha+"','"+resolucion+"','"+comentario+"','"+Museo+"','"+codigoSeguro +"')");
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
    public ArrayList mostrarPrestamo(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT folioPrestamo, fechaPrestamo, resolucionPrestamo, comentarioPrestamo, codigoMuseo, codigoSeguro "
                    + "FROM Prestamo INNER JOIN Museo, SeguroObra ON "
                    + "Prestamo.codigoMuseo=Museo.codigoMuseo"
                    + "Prestamo.codigoSeguro=SeguroObra.codigoSeguro"
                    + "WHERE folioPrestamo LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Prestamo(res.getInt("folioPrestamo"), res.getString("fechaPrestamo"), res.getString("resolucionPrestamo"), res.getString("comentarioPrestamo"), res.getString("nombreMuseo"), res.getInt("montoSeguro")));
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

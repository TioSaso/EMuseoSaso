/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Devolucion;
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
public class controlCRUDDevolucion {

    ArrayList<Devolucion> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminaDevolucion(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Devolucion WHERE folioDevolucion='" + codigo + "'");
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
    public boolean modificarDevolucion(int codigo, String fecha, int documentos, String comentario, int Museo, int codigoSeguro ) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Devolucion SET fechaDevolucion='" + fecha+"', documentosAsociados='" +documentos+"', comentarioPrestamo"+comentario+"' WHERE folioDevolucion='" + codigo + "'");
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

    public boolean insertarDevolucion(int folio,String fecha, int documentos, String comentario ) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Devolucion(folioDevolucion,fechaDevolucion, documentosAsociados, comentarioDevolucion) VALUES('"+folio+"','" + fecha+"','"+documentos+"','"+comentario+"')");
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
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT folioDevolucion, fechaDevolucion, documentosAsociados, comentarioDevolucion, montoSeguro "
                    + "FROM Devolucion INNER JOIN Prestamo ON "
                    + "Devolucion.folioDevolucion=Prestamo.folioPrestamo "
                    + "WHERE folioDevolucion LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Devolucion(res.getInt("folioDevolucion"), res.getString("fechaDevolucion"), res.getInt("DocumentosAsociados"), res.getString("comentarioDevolucion"), res.getInt("montoSeguro")));
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

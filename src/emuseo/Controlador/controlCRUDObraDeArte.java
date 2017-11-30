/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.ObraDeArte;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDObraDeArte {

    ArrayList<ObraDeArte> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Delete
    public boolean eliminarObra(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Obras WHERE codigoObraArte='" + codigo + "'");
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
    public boolean modificarObra(int codigo, String nombre, String fCreacion, String fLlegada, int estadoObraArte, int codigoAutor, int codigoTipoOA) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Obras SET nombreObraArte='" + nombre + "',fechaObraArte='" + fCreacion + "',fechaLlegadaObraArte='" + fLlegada + "', estadoObraArte='" + estadoObraArte + ", codigoAutor='" + codigoAutor + ", codigoTipoOA='" + codigoTipoOA + "' WHERE codigoObra='" + codigo + "'");
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

    public boolean insertarObra(String titulo, String fCreacion, String fLlegada, int estadoObraArte, int codigoAutor, int codigoTipoOA) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Obras(nombreObraArte,fechaObraArte,fechaLlegadaObraArte,estadoObraArte,codigoAutor,codigoTipoOA) VALUES('" + titulo + "','" + fCreacion + "','" + fLlegada+"',"+estadoObraArte+"','"+codigoAutor + "','" + codigoTipoOA + "')");
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
    public ArrayList mostrarObra(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT codigoObraArte, nombreObraArte, fechaObraArte, fechaLlegadaObraArte, estadoObraArte, codigoAutor, codigoTipoOA "
                    + "FROM Obras INNER JOIN Autores, TipoOA ON "
                    + "Obras.codigoAutor=Autores.codigoAutor "
                    + "Obras.codigoTipoOA=TipoOA.codigoTipoOA "
                    + "WHERE tituloObra LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new ObraDeArte(res.getInt("codigoObra"), res.getString("nombreObraArte"), res.getString("fechaObraArte"), res.getString("fechaLlegadaObraArte"), res.getInt("estadoObraArte"), res.getString("nombreAutor"), res.getString("descripcionTipoOA")));
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

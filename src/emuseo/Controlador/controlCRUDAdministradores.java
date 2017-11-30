/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Modelo.Administradores;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author alvar
 */
public class controlCRUDAdministradores {
        
    ArrayList<Administradores> lista = new ArrayList<>();
    //Instancia a ControlConexion
    controlConexion conex = new controlConexion();

    //Validar Ingreso
    public boolean validar(String email, int contraseña){
           try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("SELECT * FROM Administradores WHERE emailSeguridad='"+email+"' and claveSeguridad='"+contraseña+"'");
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            conex.cerrar();
        }
        return false;
    }
    //Delete
    public boolean eliminarAdmin(String email) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Administradores WHERE emailSeguridad='" + email +"'");
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

    public boolean modificarUsuario(String newemail, String newnombre, int newcontraseña, String email) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Administradores set emailSeguridad='" + newemail +"',claveSeguridad='"+newcontraseña+"',nombre='"+newnombre+ "' WHERE emailSeguridad='" + email + "'");
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            conex.cerrar();
        }
        return false;
    }
    //Create

    public boolean insertarUsuario(String email,String nombre, int contraseña) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Administradores(emailSeguridad,nombre,claveSeguridad) VALUES('" + email +"','"+nombre+"','"+contraseña+"')");
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
    public ArrayList mostrarCuentas(String nombre) {
        lista.clear();
        //Abrir conexion al servidor
        conex.conectar();
        //Seleccionar todos los datos de Paises
        try {
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT * FROM Administradores WHERE emailSeguridad LIKE '%" + nombre + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Administradores(res.getString("emailSeguridad"),res.getString("nombre"),res.getInt("claveSeguridad")));
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

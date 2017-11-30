/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;

import emuseo.Controlador.controlConexion;
import emuseo.Modelo.Especialidad;
import emuseo.Modelo.Personal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author 19875861-2
 */
public class controlCRUDPersonal {

    ArrayList<Personal> lista = new ArrayList<>();
    //Instancia a controlConexion   
    controlConexion conex = new controlConexion();

    //Read
    public ArrayList mostrarPersonal(String dato) {

        try {
            lista.clear();
            //Abrir conexion al servidor
            conex.conectar();
            //Seleccionar todos los datos de Paises
            PreparedStatement consulta = conex.estado().prepareStatement("SELECT * FROM Personal WHERE nombrePersonal LIKE '%" + dato + "%' OR rutPersonal LIKE '%" + dato + "%' OR username LIKE '%" + dato + "%'");
            ResultSet res = consulta.executeQuery();
            while (res.next()) {
                lista.add(new Personal(res.getInt("codigoPersonal"), res.getString("nombrePersonal"), res.getString("rutPersonal"), res.getString("username")));
            }
        } catch (SQLException ex) {
            System.out.println("Error: " + ex);
        } finally {
            //Cerrar conexion
            conex.cerrar();
        }
        return lista;
    }

    //Delete
    public boolean eliminarPersonal(int codigo) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("DELETE FROM Personal WHERE codigoPersonal='" + codigo + "'");
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
    public boolean modificarPersonal(int codigo, String nombrePersonal, String rutPersonal, String direccionPersonal, String fonoPersonal, String username, String password) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("UPDATE Personal SET nombrePersonal='" + nombrePersonal + "', rutPersonal='" + rutPersonal + "', direccionPersonal='" + direccionPersonal
                    + "', fonoPersonal='" + fonoPersonal + "', username='" + username + "', password='" + password + "' WHERE codigoPersonal='" + codigo + "'");
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

    public boolean insertarPersonal(String nombrePersonal, String rutPersonal, String direccionPersonal, String fonoPersonal, String username, String password) {
        try {
            conex.conectar();
            PreparedStatement sql = conex.estado().prepareStatement("INSERT INTO Nacionalidad(nombrePersona, rutPersonal, direccionPersonal, fonoPersonal, username, password) VALUES('" + nombrePersonal + "','" + rutPersonal + "','" + fonoPersonal + "','" + username + "','" + password + "')");
            sql.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Error: " + e);
        } finally {
            conex.cerrar();
        }
        return false;
    }
//Restaurador
    public class controlCRUDRestaurador {
        ArrayList<Especialidad> lista2 = new ArrayList<>();
        //Instancia a controlConexion   
        controlConexion conex = new controlConexion();

        //Read
        public ArrayList mostrarPersonal(String dato) {
            try {
                lista.clear();
                //Abrir conexion al servidor
                conex.conectar();
                //Seleccionar todos los datos de Paises
                PreparedStatement consulta = conex.estado().prepareStatement("SELECT * FROM Especialidad WHERE nombreEspecialidad LIKE '%" + dato + "%'");
                ResultSet res = consulta.executeQuery();
                while (res.next()) {
                    lista2.add(new Especialidad(res.getInt("codigoEspecialidad"), res.getString("nombreEspecialidad")));
                }
            } catch (SQLException ex) {
                System.out.println("Error: " + ex);
            } finally {
                //Cerrar conexion
                conex.cerrar();
            }
            return lista;
        }
    }

    public class controlCrudGuiaTuristico {

    }
}

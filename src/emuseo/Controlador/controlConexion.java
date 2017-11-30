/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emuseo.Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 19875861-2
 */
public class controlConexion {
   private String uri="jdbc:mysql://127.0.0.1/museoculiaombonito";
   private String usuario="root";
   private String password="";
   private Connection con=null;
    //Conectar
    public void conectar(){
       try {
           Class.forName("com.mysql.jdbc.Driver");
           con=DriverManager.getConnection(uri,usuario,password);
       } catch (ClassNotFoundException | SQLException ex) {
           System.out.println("Error: "+ex);
       } 
    }
    //Cerrar
    public void cerrar(){
        con=null;
    }
    //Estatus
    public Connection estado(){
        return con;
    }
    
}

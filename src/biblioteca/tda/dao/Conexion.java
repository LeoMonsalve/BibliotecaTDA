/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author henrry
 */
public class Conexion {
    public Connection con;
    public Statement state;
    private String jbdc = "jdbc:mysql://localhost:3306/biblioteca";
    private String username = "root";
    private String password = "root";
    
//creamos metodo para conectarnos a la BBDD
    public void conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(jbdc, username, password);
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //implementamos metodo para que nos devuelva el ultimo valor ID ingresado.
    public  int ultimoId(String tabla) throws SQLException {
        conectar();
        int ultimoId=0;
        ResultSet result = state.executeQuery("SELECT id FROM " + tabla + " order by id desc limit 1;");
        
         while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }
}

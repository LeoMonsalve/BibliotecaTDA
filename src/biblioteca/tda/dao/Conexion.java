/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
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
    

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection(jbdc, username, password);
            state = con.createStatement();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

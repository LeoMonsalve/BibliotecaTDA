/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author henrry
 */
public class LibroDAO extends Conexion {
    
    public LibroDAO() {
        super();
    }
    
    public int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId = 0;
        ResultSet result = state.executeQuery("SELECT @@identity AS id FROM autor");
        
        while(result.next()) {
            ultimoId = (int) result.getObject(0);
        }
        return ultimoId;
    }
    
    public void insertar() {
        
    }
}

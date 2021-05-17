/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Autor;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author henrry
 */
public class AutorDAO extends Conexion {
    
    public AutorDAO() {
        super();
    }
        public int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId = 0;
        ResultSet result = state.executeQuery("SELECT id FROM autor order by id desc limit 1;");

        while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }
        
        public void insertar(Autor autor) {
        try {
            super.conectar();
            int id = ultimoId();
            id++;
            super.state.executeUpdate("INSERT INTO autor VALUES (" + id
            + ", '" + autor.getNombre() + "', '" + autor.getApellido() + "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

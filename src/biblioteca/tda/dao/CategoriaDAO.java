/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author leone
 */
public class CategoriaDAO extends Conexion{
    
    public CategoriaDAO(){
        super();
    }
    
    public  int ultimoId() throws SQLException {
        super.conectar();
        int ultimoId=0;
        ResultSet result = state.executeQuery("\"SELECT id FROM categoria order by id desc limit 1;\"");
        
         while (result.next()) {
            ultimoId = (int) result.getObject(1);
        }
        return ultimoId;
    }
    
    public void insertar(Categoria categoria){
            try {
            super.conectar();
            int ultimoRegistro = ultimoId();
            ultimoRegistro++;
            super.state.executeUpdate("INSERT INTO categoria VALUES (" + ultimoRegistro
                    + ", '" + categoria.getTipo()+ "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

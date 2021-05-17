/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Categoria;
import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public Categoria buscar(int id) throws SQLException, Exception{
        super.conectar();
        Categoria categoria = new Categoria();
        ResultSet result = state.executeQuery(
            "SELECT * FROM caterogia WHERE id ='" + id + "' ;");
        while(result.next()){
            categoria.setId((int) result.getObject(1));
            categoria.setTipo((String) result.getObject(2));
        }
        return categoria;
    }

    public ArrayList<Categoria> listarCategorias() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM categoria");
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();

        while(result.next()){
            Categoria categoria = new Categoria();

            categoria.setId((int)result.getObject(1));
            categoria.setTipo((String)result.getObject(2));

        }
        return categorias;
    }
    public void modificar(Categoria categoria){
      try {
        super.conectar();
        int ultimoRegistro= ultimoId();
        ultimoRegistro++;
        super.state.executeQuery("UPDATE categoria set tipo='" + categoria.getTipo() + "';");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM categoria WHERE id="+ id +";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

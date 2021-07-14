/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Categoria;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henrr
 */
public class CategoriaDAO extends Conexion {

    public CategoriaDAO() {
        super();
    }
    //creamos metodo para insertar
    public void insertar(Categoria categoria){
            try {
            super.conectar();
            int id = super.ultimoId("categoria") + 1;
            super.state.executeUpdate("INSERT INTO categoria VALUES (" + id
                    + ", '" + categoria.getTipo()+ "');");  
                    
              con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
// buscamos categoria
    public Categoria buscar(int id) throws SQLException, Exception{
        super.conectar();
        //creamos nuevo objeto para setearle los valores.
        Categoria categoria = new Categoria();
        
        ResultSet result = state.executeQuery(
            "SELECT * FROM categoria WHERE id ='" + id + "' ;");
        while(result.next()){
            categoria.setId((int) result.getObject(1));
            categoria.setTipo((String) result.getObject(2));
        }
        return categoria;
    }
    //metodo para Listar categorias
    public ArrayList<Categoria> listarCategorias() throws SQLException, Exception{

        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM categoria");
        //creamos nuevo objeto que tomara los valores de Categoria
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        

        while(result.next()){
            //creamos objeto categoria para tomar los valores.
            Categoria categoria = new Categoria();

            categoria.setId((int)result.getObject(1));
            categoria.setTipo((String)result.getObject(2));
            //agregamos los valores al nuevo array
            categorias.add(categoria);
        }
        //retornamos el objeto categorias con los valores ya guardados.
        return categorias;
    }
    //creamos metodo modificar 
    public void modificar(Categoria categoria){
      try {
        super.conectar();
        super.state.executeUpdate("UPDATE categoria set tipo='" + categoria.getTipo() + "' where id="+
        categoria.getId() + ";");
        con.close();
    } catch (Exception e) {
         e.printStackTrace();
      }  
    }
    //creamos metodo eliminar.
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM categoria WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

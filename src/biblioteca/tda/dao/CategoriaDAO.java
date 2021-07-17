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
    /**
     * Método para insertar nueva Categoria en la base de datos
     * @param categoria Objeto Categoria con todos los datos a insertar
     */
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
    /**
     * Método para buscar Categoria por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Categoria con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
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
    /**
     * Método para devolver todas las cateogiras de la base de datos
     * @return ArrayList con todos las categorias 
     * @throws SQLException
     * @throws Exception 
     */
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
    /**
     * Método para modificar categoria en la base de datos
     * @param categoria Objeto Categoria con los datos modificados
     */
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
    /**
     * Método que elimina Categoria por ID
     * @param id int requerido para buscar en la base de datos
     * @return int con el número de filas afectadas
     */
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

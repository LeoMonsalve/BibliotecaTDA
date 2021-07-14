/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Autor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Autor
 * @author henrry
 */
public class AutorDAO extends Conexion {

    public AutorDAO() {
        super();
    }
    //insertar valores en bbdd
    /**
     * Método para insertar nueva Autor en la base de datos
     * @param autor 
     */
    public void insertar(Autor autor) {
        try {
            super.conectar();
            int id = super.ultimoId("autor") + 1;
            super.state.executeUpdate("INSERT INTO autor VALUES (" + id
                    + ", '" + autor.getNombre() + "', '" + autor.getApellido() + "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 
    
    //buscamos autor por ID en BBDD
    /**
     * Método para buscar Autor por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Autor
     * @throws SQLException
     * @throws Exception 
     */
    public Autor buscar(int id) throws SQLException, Exception {
        super.conectar();
        //creamos objeto autor para tomar los valores 
        Autor autor = new Autor();
        ResultSet result = state.executeQuery("SELECT * FROM autor WHERE id = '" + id + "' ;");

        while (result.next()) {
            autor.setId((int) result.getObject(1));
            autor.setNombre((String) result.getObject(2));
            autor.setApellido((String) result.getObject(3));
        }
        return autor;
    }
    
    //Listamos los valores de la tabla Autor
    /**
     * Método para devolver todas los autores de la base de datos
     * @return Objeto ArrayList con todos los autores
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Autor> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM autor");
        
        ArrayList<Autor> autores = new ArrayList<Autor>();
        //creamos un objeto autores para guardar los valores de autor.
        while(result.next()) {
            Autor autor = new Autor();
            autor.setId((int) result.getObject(1));
            autor.setNombre((String) result.getObject(2));
            autor.setApellido((String) result.getObject(3));
            autores.add(autor);
        }
        //retornamos el objeto autores quien ya contiene los valores de autor.
        return autores;
    }
    //creamos el metodo modificar
    /**
     * Método para modificar Autor en la base de datos
     * @param autor Objeto autor
     * @throws SQLException 
     */
    public void modificar(Autor autor) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE autor set nombre='" + autor.getNombre()
                    + "', apellido='" + autor.getApellido()+ "' where id=" + autor.getId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //creamos metodo Eliminar.
    /**
     * 
     * @param id
     * @return entero 
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM autor WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
    
}

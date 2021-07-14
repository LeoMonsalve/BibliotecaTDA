/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Ciudad;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Ciudad
 * @author leone
 */
public class CiudadDAO extends Conexion{
    public CiudadDAO() {
        super();
    }
    //Mettodo para insertar Ciudad
    /**
     * Método para insertar nueva Ciudad en la base de datos
     * @param ciudad Objeto Ciudad que se insertará en la base de datos
     */
    public void insertar(Ciudad ciudad) {
        try {
            super.conectar();
            int id = super.ultimoId("ciudad") + 1;
            super.state.executeUpdate("INSERT INTO ciudad VALUES (" + id
                    + ", '" + ciudad.getNombre()+ "', " + ciudad.getRegionId()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    //creamos metodo para buscar ciudad por ID 
    /**
     * Método para buscar Ciudad por ID en la base de datos
     * @param id int para buscar en la base de datos.
     * @return Ciudad con los datos buscados en la base de datos
     * @throws SQLException
     * @throws Exception 
     */
    public Ciudad buscar(int id) throws SQLException, Exception {
        super.conectar();
        //creamos objeto para setearle los valores.
        Ciudad ciudad = new Ciudad();
        ResultSet result = state.executeQuery("SELECT * FROM ciudad WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            ciudad.setId((int) result.getObject(1));
            ciudad.setNombre((String) result.getObject(2));
            ciudad.setRegionId((int)result.getObject(3));
        }
        return ciudad;
    }
    //Creamoos metodo para buscar por Nombre
    /**
     * Método para buscar Ciudad por ID en la base de datos
     * @param nombreCiudad String para buscar en la base de datos.
     * @return Ciudad con los datos buscados en la base de datos
     * @throws SQLException
     * @throws Exception 
     */
    public Ciudad buscar(String nombreCiudad) throws SQLException, Exception {
        super.conectar();
         //creamos objeto para setearle los valores.
        Ciudad ciudad = new Ciudad();
        ResultSet result = state.executeQuery("SELECT * FROM ciudad WHERE nombre LIKE '%" + nombreCiudad + "%' ;");
        
        while (result.next()) {
            ciudad.setId((int) result.getObject(1));
            ciudad.setNombre((String) result.getObject(2));
            ciudad.setRegionId((int)result.getObject(3));
        }
        return ciudad;
    }
    //creamos metodo para listar las ciudades
    /**
     * Método para devolver todas las ciudades de la base de datos
     * @return ArrayList con todas las ciudades
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Ciudad> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM ciudad");
        //creamos nuevo objeto "ciudades" que contendrá los valores de las ciudades
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
        
        while(result.next()) {
            //creamos objeto ciudad para tomar los valores
            Ciudad ciudad = new Ciudad();
            ciudad.setId((int) result.getObject(1));
            ciudad.setNombre((String) result.getObject(2));
            ciudad.setRegionId((int)result.getObject(3));
            //añadimos los valores de ciudad a ciudades.
            ciudades.add(ciudad);
        }
        //retornamos el objeto ciudades.
        return ciudades;
    }
    //creamos metodo modificar
    /**
     * Método para modificar Ciudad en la base de datos
     * @param ciudad Objeto Ciudad con los datos modificados
     * @throws SQLException 
     */
    public void modificar(Ciudad ciudad) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE ciudad set nombre='" + ciudad.getNombre()+ 
                    "'," + " region_id=" +ciudad.getRegionId()+ " WHERE id =" + ciudad.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    //creamos metodo eliminar
    /**
     * Método que elimina Ciudad por ID
     * @param id int con el ID que se ejecutará la QUERY
     * @return int con el número de filas afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM ciudad WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

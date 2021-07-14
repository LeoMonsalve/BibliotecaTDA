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
 *
 * @author leone
 */
public class CiudadDAO extends Conexion{
    public CiudadDAO() {
        super();
    }
    //Mettodo para insertar Ciudad
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

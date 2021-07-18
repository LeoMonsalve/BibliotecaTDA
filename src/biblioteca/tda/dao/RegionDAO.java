/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Region;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Region
 * @author leone
 */
public class RegionDAO extends Conexion {
     public RegionDAO() {
        super();
    }

     /**
     * Método para insertar nueva Region en la base de datos
     * @param region Objeto Distribuidor con todos los datos a insertar
     */
    public void insertar(Region region) {
        try {
            super.conectar();
            int id = super.ultimoId("region") + 1;
            super.state.executeUpdate("INSERT INTO region VALUES (" + id + ", '" + region.getNombre()+ "');");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Método para buscar Region por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Region con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Region buscar(int id) throws SQLException, Exception {
        super.conectar();
        Region region = new Region();
        ResultSet result = state.executeQuery("SELECT * FROM region WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            region.setId((int) result.getObject(1));
            region.setNombre((String) result.getObject(2));
            
        }
        return region;
    }
    
    /**
     * Método para devolver todos las regiones de la base de datos
     * @return ArrayList con todos las regiones
     * @throws SQLException
     * @throws Exception 
     */
    public Region buscar(String nombre) throws SQLException, Exception {
        super.conectar();
        Region region = new Region();
        ResultSet result = state.executeQuery("SELECT * FROM region WHERE nombre LIKE '%" + nombre + "%' ;");
        
        while (result.next()) {
            region.setId((int) result.getObject(1));
            region.setNombre((String) result.getObject(2));
            
        }
        return region;
    }
    
    /**
     * Método para devolver todos las regiones de la base de datos
     * @return ArrayList con todos las regiones
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Region> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM region");
        
        ArrayList<Region> regiones = new ArrayList<Region>();
        
        while(result.next()) {
            Region region = new Region();
            region.setId((int) result.getObject(1));
            region.setNombre((String) result.getObject(2));
           
            regiones.add(region);
        } 
        return regiones;
    }
    
    /**
     * Método para modificar region en la base de datos
     * @param region Objeto region con los datos modificados
     */
    public void modificar(Region region) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE region set nombre='" + region.getNombre() + 
                    "' WHERE id =" + region.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Método que elimina Region por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM region WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

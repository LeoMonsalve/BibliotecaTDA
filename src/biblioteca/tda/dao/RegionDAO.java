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
 *
 * @author leone
 */
public class RegionDAO extends Conexion {
     public RegionDAO() {
        super();
    }

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
    
    public Region buscar(int id) throws SQLException {
        super.conectar();
        Region region = new Region();
        ResultSet result = state.executeQuery("SELECT * FROM region WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            region.setId((int) result.getObject(1));
            region.setNombre((String) result.getObject(2));
            
        }
        return region;
    }
    
    public ArrayList<Region> listar() throws SQLException {
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
    
    public void modificar(Region region) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE region set nombre='" + region.getNombre()+ 
                    "'," +  " WHERE id =" + region.getId() + ";");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM region WHERE id = " + id + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

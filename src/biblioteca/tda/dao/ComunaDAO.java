/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Comuna;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leone
 */
public class ComunaDAO extends Conexion {
      public ComunaDAO() {
        super();
    }

    public void insertar(Comuna comuna) {
        try {
            super.conectar();
            int id = super.ultimoId("comuna") + 1;
            super.state.executeUpdate("INSERT INTO comuna VALUES (" + id
                    + ", '" + comuna.getNombre()+ "', " + comuna.getCiudadId()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Comuna buscar(int id) throws SQLException, Exception {
        super.conectar();
        Comuna comuna= new Comuna();
        ResultSet result = state.executeQuery("SELECT * FROM comuna WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
        }
        return comuna;
    }
    
    public Comuna buscar(String nombreComuna) throws SQLException, Exception {
        super.conectar();
        Comuna comuna= new Comuna();
        ResultSet result = state.executeQuery("SELECT * FROM comuna WHERE nombre LIKE = '%" + nombreComuna + "%' ;");
        
        while (result.next()) {
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
        }
        return comuna;
    }
    
    public ArrayList<Comuna> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM comuna");
        
        ArrayList<Comuna> comunas = new ArrayList<Comuna>();
        
        while(result.next()) {
            Comuna comuna = new Comuna();
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
            comunas.add(comuna);
        }
        return comunas;
    }
    
    public void modificar(Comuna comuna) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE comuna set nombre='" + comuna.getNombre()+ 
                    "'," + " ciudad_id=" +comuna.getCiudadId()+ " WHERE id =" + comuna.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM comuna WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

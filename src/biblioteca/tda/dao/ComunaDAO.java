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
//creamos metodo insertar para la BBDD
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
    //implementamos metodo buscar por ID 
    public Comuna buscar(int id) throws SQLException, Exception {
        super.conectar();
        //Creamos nuevo objeto comuna para tomar los valroes.
        Comuna comuna= new Comuna();
        ResultSet result = state.executeQuery("SELECT * FROM comuna WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
        }
        return comuna;
    }
    //creamos metodo para buscar por Nombre de comuna
    public Comuna buscar(String nombreComuna) throws SQLException, Exception {
        super.conectar();
        //creamos nuevo objeto comunca para tomar los valores.
        Comuna comuna= new Comuna();
        ResultSet result = state.executeQuery("SELECT * FROM comuna WHERE nombre LIKE = '%" + nombreComuna + "%' ;");
        
        while (result.next()) {
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
        }
        return comuna;
    }
    
    //creamos metodo que nos liste todas las comunas
    public ArrayList<Comuna> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM comuna");
        //creamos objeto que guarde todas las comunas
        ArrayList<Comuna> comunas = new ArrayList<Comuna>();
        
        while(result.next()) {
            Comuna comuna = new Comuna();
            comuna.setId((int) result.getObject(1));
            comuna.setNombre((String) result.getObject(2));
            comuna.setCiudadId((int)result.getObject(3));
            //añadimos las comunas al objeto
            comunas.add(comuna);
        }
        //retornamos el objeto con todas las comunas.
        return comunas;
    }
    //implementamos metodo modificar 
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
    //implementamos metodo eliminar 
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

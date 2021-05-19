/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Direccion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author henrry
 */
public class DireccionDAO extends Conexion {
    
    public DireccionDAO() {
        super();
    }
    
    public void insertar(Direccion direccion) {
        try {
            super.conectar();
            int id = super.ultimoId("direccion") + 1;
            super.state.executeUpdate("INSERT INTO direccion VALUES (" + id + 
                    ", '" + direccion.getCalle() + "', " + direccion.getNumero() 
                    + ", " + direccion.getComunaId() +
                    ", " + direccion.getListaDirecciones() + ");");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public Direccion buscar(int id) throws SQLException, Exception {
        super.conectar();
        Direccion direccion = new Direccion();
        ResultSet result = state.executeQuery(
            "SELECT * FROM direccion WHERE id ='" + id + "' ;");
        while(result.next()) {
            direccion.setId((int) result.getObject(1));
            direccion.setCalle((String) result.getObject(2));
            direccion.setNumero((int) result.getObject(3));
            direccion.setComunaId((int) result.getObject(4));
            direccion.setListaDirecciones((int) result.getObject(5));
        }
        return direccion;
    }
    
    public ArrayList<Direccion> listarDirecciones() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM direcciones");
        ArrayList<Direccion> direcciones = new ArrayList<Direccion>();
        
        while(result.next()) {
            Direccion direccion= new Direccion();
            direccion.setId((int) result.getObject(1));
            direccion.setCalle((String) result.getObject(2));
            direccion.setNumero((int) result.getObject(3));
            direccion.setComunaId((int) result.getObject(4));
            direccion.setListaDirecciones((int) result.getObject(5));
            direcciones.add(direccion);
        }
        return direcciones;
    }
    
    public void modificar(Direccion direccion) {
        try {
            super.conectar();
            super.state.executeQuery("UPDATE compra set calle='" +  direccion.getCalle() +
         "', numero=" + direccion.getNumero() + ", comuna_id= "
        + direccion.getComunaId() + ", lista_direcciones_id=" + direccion.getListaDirecciones() +
                    " where id=" + direccion.getId() + ";");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public int eliminar(int id){
        int entero=0;
        try {
            super.conectar();
            entero= state.executeUpdate("Delete FROM direccion WHERE id="+ id +";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
    
    
    
}

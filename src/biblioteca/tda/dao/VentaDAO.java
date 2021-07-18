/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Venta;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Venta
 * @author leone
 */
public class VentaDAO extends Conexion {
    public VentaDAO() {
        super();
    }

    /**
     * Método para insertar nuevo Venta en la base de datos
     * @param distribuidor Objeto Venta con todos los datos a insertar
     */
    public void insertar(Venta venta) {
        try {
            super.conectar();
            int id = super.ultimoId("venta") + 1;
            super.state.executeUpdate("INSERT INTO venta VALUES (" + id
                    + ", " + venta.getClienteId()+ ", " + venta.getTrabajadorId()+", "
                    +venta.getBoletaId()+ " );");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    
    /**
     * Método para buscar Venta por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Venta con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Venta buscar(int id) throws SQLException {
        super.conectar();
        Venta v = new Venta();
        ResultSet result = state.executeQuery("SELECT * FROM venta WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            v.setId((int) result.getObject(1));
            v.setClienteId((int) result.getObject(2));
            v.setTrabajadorId((int)result.getObject(3));
            v.setBoletaId((int)result.getObject(4));
        }
        return v;
    }
    
    
    /**
     * Método para devolver todos los ventas de la base de datos
     * @return ArrayList con todos los ventas
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Venta> listar() throws SQLException {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM venta");
        
        ArrayList<Venta> vs = new ArrayList<Venta>();
        
        while(result.next()) {
             Venta v = new Venta();
             v.setId((int) result.getObject(1));
             v.setClienteId((int) result.getObject(2));
             v.setTrabajadorId((int)result.getObject(3));
             v.setBoletaId((int)result.getObject(4));
             vs.add(v);
        }
        return vs;
    }
    
    /**
     * Método para modificar venta en la base de datos
     * @param distribuidor Objeto venta con los datos modificados
     */
    public void modificar(Venta venta) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE venta set cliente_id=" + venta.getClienteId() + 
                    ", " + " tabajador_id=" +venta.getTrabajadorId()+", " +venta.getClienteId()+ " WHERE id =" + venta.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Método que elimina Venta por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM venta WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

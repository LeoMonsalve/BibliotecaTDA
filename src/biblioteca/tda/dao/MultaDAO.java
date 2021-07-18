/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Multa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Multa
 * @author henrry
 */
public class MultaDAO extends Conexion {

    public MultaDAO() {
        super();
    }
    
    /**
     * Método para insertar nueva Multa en la base de datos
     * @param distribuidor Objeto Multa con todos los datos a insertar
     */
    public void insertar(Multa multa) {
        try {
            super.conectar();
            int id = super.ultimoId("multa") + 1;
            super.state.executeUpdate("INSERT INTO multa VALUES (" + id 
                    + ", " + multa.getCosto() + ");");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Método para buscar Multta por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Multa con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Multa buscar(int id) throws SQLException {
        super.conectar();
        Multa multa = new Multa();
        ResultSet result = state.executeQuery("SELECT * FROM autor WHERE id = '" + id + "' ;");
        while(result.next()) {
            multa.setId((int) result.getObject(1));
            multa.setCosto((int) result.getObject(2));
        }
        return multa;
    }
    
    /**
     * Método para devolver todas las multas de la base de datos
     * @return ArrayList con todos las multas
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Multa> listar() throws SQLException, Exception {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM autor");
        
        ArrayList<Multa> multas = new ArrayList<Multa>();
        
        while(result.next()) {
            Multa multa = new Multa();
            multa.setId((int) result.getObject(1));
            multa.setCosto((int) result.getObject(2));
            multas.add(multa);
        }
        
        return multas;
    }
    
    /**
     * Método para modificar Multa en la base de datos
     * @param multa Objeto Distribuidor con los datos modificados
     */
    public void modificar(Multa multa) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE multa set costo=" + multa.getCosto()
                    + " where id=" + multa.getId() + ";");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }        
    }
    
    /**
     * Método que elimina Multa por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM multa WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

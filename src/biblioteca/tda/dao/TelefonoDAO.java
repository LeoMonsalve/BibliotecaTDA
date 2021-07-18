/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Telefono;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * DAO para el manejo de la base de datos con la tabla Telefono
 * @author leone
 */
public class TelefonoDAO extends Conexion {
     public TelefonoDAO() {
        super();
    }

     
     /**
     * Método para insertar nuevo Telefono en la base de datos
     * @param distribuidor Objeto Telefono con todos los datos a insertar
     */
    public void insertar(Telefono telefono) {
        try {
            super.conectar();
            int id = super.ultimoId("telefono") + 1;
            super.state.executeUpdate("INSERT INTO telefono VALUES (" + id
                    + ", '" + telefono.getNumero()+ "', NULL);");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    /**
     * Método para buscar Telefono por ID en la base de datos
     * @param id Parámetro ID para buscar en la base de datos
     * @return Objeto Telefono con los datos buscados en la base de Datos
     * @throws SQLException
     * @throws Exception 
     */
    public Telefono buscar(int id) throws SQLException {
        super.conectar();
        Telefono telefono = new Telefono();
        ResultSet result = state.executeQuery("SELECT * FROM telefono WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            telefono.setId((int) result.getObject(1));
            telefono.setNumero((String) result.getObject(2));
            telefono.setListaNumeros((int)result.getObject(3));
        }
        return telefono;
    }
    
    /**
     * Método para devolver todos los telefonos de la base de datos
     * @return ArrayList con todos los telefonos
     * @throws SQLException
     * @throws Exception 
     */
    public ArrayList<Telefono> listar() throws SQLException {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM telefono");
        
        ArrayList<Telefono> telefonos = new ArrayList<Telefono>();
        
        while(result.next()) {
            Telefono telefono = new Telefono();
            telefono.setId((int) result.getObject(1));
            telefono.setNumero((String) result.getObject(2));
            telefono.setListaNumeros((int)result.getObject(3));
            telefonos.add(telefono);
        }
        return telefonos;
    }
    
    /**
     * Método para modificar telefonos en la base de datos
     * @param telefono Objeto Telefono con los datos modificados
     */
    public void modificar(Telefono telefono) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE telefono set numero='" + telefono.getNumero()+ 
                    "'," + " lista_numeros=" +telefono.getListaNumeros()+ " WHERE id =" + telefono.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    /**
     * Método que elimina Telefono por ID
     * @param id int requerido para eliminar en la base de datos
     * @return entero con el numero de filas que fueron afectadas
     */
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM telefono WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

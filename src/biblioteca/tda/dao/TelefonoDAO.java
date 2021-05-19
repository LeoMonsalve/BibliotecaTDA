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
 *
 * @author leone
 */
public class TelefonoDAO extends Conexion {
     public TelefonoDAO() {
        super();
    }

    public void insertar(Telefono telefono) {
        try {
            super.conectar();
            int id = super.ultimoId("telefono") + 1;
            super.state.executeUpdate("INSERT INTO telefono VALUES (" + id
                    + ", '" + telefono.getNumero()+ "', " + telefono.getListaNumeros()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
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

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
 *
 * @author henrry
 */
public class MultaDAO extends Conexion {

    public MultaDAO() {
        super();
    }
    
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

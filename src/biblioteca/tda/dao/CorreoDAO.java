/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.tda.dao;

import biblioteca.tda.modelo.Correo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author leone
 */
public class CorreoDAO extends Conexion {
       public CorreoDAO() {
        super();
    }

    public void insertar(Correo correo) {
        try {
            super.conectar();
            int id = super.ultimoId("correo") + 1;
            super.state.executeUpdate("INSERT INTO idioma VALUES (" + id
                    + ", '" + correo.getCorreo()+ "', " + correo.getListaCorreo()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public Correo buscar(int id) throws SQLException {
        super.conectar();
        Correo correo = new Correo();
        ResultSet result = state.executeQuery("SELECT * FROM correo WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            correo.setId((int) result.getObject(1));
            correo.setCorreo((String) result.getObject(2));
            correo.setListaCorreo((int)result.getObject(3));
        }
        return correo;
    }
    
    public ArrayList<Correo> listar() throws SQLException {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM correo");
        
        ArrayList<Correo> correos = new ArrayList<Correo>();
        
        while(result.next()) {
            Correo correo = new Correo();
            correo.setId((int) result.getObject(1));
            correo.setCorreo((String) result.getObject(2));
            correo.setListaCorreo((int)result.getObject(3));
            correos.add(correo);
        }
        return correos;
    }
    
    public void modificar(Correo correo) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE correo set correo='" + correo.getCorreo() + 
                    "'," + " lista_correo=" +correo.getListaCorreo()+ " WHERE id =" + correo.getId() + ";");
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM correo WHERE id = " + id + ";");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}

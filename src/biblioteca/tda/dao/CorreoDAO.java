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
//creamos metodo insertar 
    public void insertar(Correo correo) {
        try {
            super.conectar();
            int id = super.ultimoId("correo") + 1;
            super.state.executeUpdate("INSERT INTO correo VALUES (" + id
                    + ", '" + correo.getCorreo()+ "', " + correo.getListaCorreo()+");");
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    //implementamos metodo buscar por ID 
    public Correo buscar(int id) throws SQLException {
        super.conectar();
        //creamos nuevo objeto correo para tomar los valores
        Correo correo = new Correo();
        ResultSet result = state.executeQuery("SELECT * FROM correo WHERE id = '" + id + "' ;");
        
        while (result.next()) {
            correo.setId((int) result.getObject(1));
            correo.setCorreo((String) result.getObject(2));
            correo.setListaCorreo((int)result.getObject(3));
        }
        return correo;
    }
    //creamos metodo que nos liste todos los correos 
    public ArrayList<Correo> listar() throws SQLException {
        super.conectar();
        ResultSet result = state.executeQuery("SELECT * FROM correo");
        //creamos objeto que contendrá todos los valores de correo
        ArrayList<Correo> correos = new ArrayList<Correo>();
        
        while(result.next()) {
            Correo correo = new Correo();
            correo.setId((int) result.getObject(1));
            correo.setCorreo((String) result.getObject(2));
            correo.setListaCorreo((int)result.getObject(3));
            //agregamos valores a correos.
            correos.add(correo);
        }
        //retornamos el objeto correos con todos los correos.
        return correos;
    }
    //implementamos el metodo modificar
    public void modificar(Correo correo) throws SQLException {
        try {
            super.conectar();
            super.state.executeUpdate("UPDATE correo set correo='" + correo.getCorreo() + 
                    "'," + " lista_correo=" +correo.getListaCorreo()+ " WHERE id =" + correo.getId() + ";");
            con.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    //implementamos el metodo eliminar
    public int eliminar(int id) {
        int entero = 0;
        try {
            super.conectar();
            entero = state.executeUpdate("DELETE FROM correo WHERE id = " + id + ";");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return entero;
    }
}
